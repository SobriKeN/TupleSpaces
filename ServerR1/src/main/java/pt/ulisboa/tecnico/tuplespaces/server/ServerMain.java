package pt.ulisboa.tecnico.tuplespaces.server;

import io.grpc.*;

import java.io.IOException;
import java.util.List;

import pt.ulisboa.tecnico.nameserver.contract.NameServerGrpc;
import pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.*;
import pt.ulisboa.tecnico.tuplespaces.server.domain.ServerState;

public class ServerMain {

        public static void main(String[] args) {
            System.out.println(ServerMain.class.getSimpleName());

            // receive and print arguments
            System.out.printf("Received %d arguments%n", args.length);
            for (int i = 0; i < args.length; i++){
                System.out.printf("args[%d] = %s%n", i, args[i]);
            }

            // check arguments
            if (args.length < 1) {
                System.err.println("Argument(s) missing!");
                System.err.println("Usage: mvn exec:java -Dexec.args=<host> <port>");
                return;
            }

            // get variables
            final int port = Integer.parseInt(args[0]);
            final String qualifier = args[1];
            final String host = "localhost";
            final String service = "TupleSpaces";
            final String target = host + ":" + port;
            final ServerState state = new ServerState();
            final BindableService impl = new ServerImpl(state);

            final ManagedChannel channel = ManagedChannelBuilder.forTarget(host + ":" + "5001").usePlaintext().build();
            final NameServerGrpc.NameServerBlockingStub stub = NameServerGrpc.newBlockingStub(channel);

            stub.register(RegisterRequest.newBuilder().setServiceName(service).setQualifier(qualifier).setServerAddress(target).build());

            // Create a new server to listen on port
            Server server = ServerBuilder.forPort(port).addService(impl).build();

            // Start the server
            try{
                server.start();
                // Server threads are running in the background.
                System.out.println("Server started");
            }
            catch (IOException e){
                System.out.println("Caught Exception: " + e.getMessage());
            }

            // Do not exit the main thread. Wait until server is terminated.

            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                // Add cleanup code here
                stub.delete(DeleteRequest.newBuilder().setServiceName(service).setServerAddress(target).build());
                channel.shutdown();
                server.shutdown();
            }));

            try {
                server.awaitTermination();
            } catch (InterruptedException e) {
                System.out.println("Server shutdown interrupted");
            }
        }
}

