import sys
import re
sys.path.insert(1, '../Contract/target/generated-sources/protobuf/python')
import grpc
import sys
from concurrent import futures
import NameServer_pb2
import NameServer_pb2_grpc

# Define o porto
PORT = 5001

def verify_input(input_string):
    pattern = r'^localhost:(\d{1,5})$'  

    match = re.match(pattern, input_string)

    if match:
        port_number = int(match.group(1))
        if 0 < port_number <= 65535:
            return True
        else:
            return False
    else:
        return False

class ServerEntry:
    def __init__(self, host_port, qualifier):
        self.host_port = host_port
        self.qualifier = qualifier

    def get_host_port(self):
        return self.host_port

    def get_qualifier(self):
        return self.qualifier


class ServiceEntry:
    def __init__(self, service_name):
        self.service_name = service_name
        self.server_entries = []

    def add_server_entry(self, server_entry):
        match server_entry.get_qualifier():
            case "A":
                self.server_entries.insert(0, server_entry)
            case "B":
                self.server_entries.insert(1, server_entry)
            case "C":
                self.server_entries.insert(2, server_entry)

    def get_service_name(self):
        return self.service_name

    def get_server_entries(self):
        return self.server_entries


class NamingServer:
    def __init__(self):
        self.service_map = {}

    def add_service_entry(self, service_name, server_entry):
        if service_name not in self.service_map:
            self.service_map[service_name] = ServiceEntry(service_name)
        self.service_map[service_name].add_server_entry(server_entry)

    def get_service_entry(self, service_name):
        if service_name in self.service_map:
            return self.service_map[service_name]
        else:
            return None


class NamingServerServiceImpl(NameServer_pb2_grpc.NameServerServicer):
    def __init__(self):
        self.naming_server = NamingServer()

    def register(self, request, context):
        service_name = request.service_name
        qualifier = request.qualifier
        server_address = request.server_address

        if verify_input(server_address) is False:
            context.set_details("Not possible to register the server")
            context.set_code(grpc.StatusCode.INVALID_ARGUMENT)
            return NameServer_pb2.RegisterResponse()

        server_entry = ServerEntry(server_address, qualifier)
        self.naming_server.add_service_entry(service_name, server_entry)

        return NameServer_pb2.RegisterResponse()

    def lookup(self, request, context):
        service_name = request.service_name
        qualifier = request.qualifier
        response = []

        service_entry = self.naming_server.get_service_entry(service_name)
        if service_entry:
            if qualifier:
                servers = [server_entry for server_entry in service_entry.get_server_entries() if server_entry.get_qualifier() == qualifier]
            else:
                servers = service_entry.get_server_entries()
            for server_entry in servers:
                response.append(server_entry.get_host_port())
            return NameServer_pb2.LookupResponse(servers = response)
        else:
            return NameServer_pb2.LookupResponse(servers = response)

    def delete(self, request, context):
        service_name = request.service_name
        server_address = request.server_address

        service_entry = self.naming_server.get_service_entry(service_name)
        if service_entry:
            for server_entry in service_entry.get_server_entries():
                if server_entry.get_host_port() == server_address:
                    service_entry.get_server_entries().remove(server_entry)
                    return NameServer_pb2.DeleteResponse()
            else:
                context.set_details("Not possible to remove the server")
                context.set_code(grpc.StatusCode.INVALID_ARGUMENT)
                return NameServer_pb2.DeleteResponse()
        else:
            context.set_details("Not possible to remove the server")
            context.set_code(grpc.StatusCode.INVALID_ARGUMENT)
            return NameServer_pb2.DeleteResponse()




if __name__ == '__main__':
    try:
        # print received arguments
        print("Received arguments:")
        for i in range(1, len(sys.argv)):
            print("  " + sys.argv[i])

        server = grpc.server(futures.ThreadPoolExecutor(max_workers = 3))
        NameServer_pb2_grpc.add_NameServerServicer_to_server(NamingServerServiceImpl(), server)
        server.add_insecure_port('[::]:' + str(PORT))
        server.start()
        print("Server started on port " + str(PORT))
        server.wait_for_termination()

    except KeyboardInterrupt:
        exit(0)


