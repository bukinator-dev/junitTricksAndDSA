package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class HelloWorldServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new GreeterImpl())
                .build();

        System.out.println("Starting server...");
        server.start();
        System.out.println("Server started!");
        server.awaitTermination();
    }
    // write some code to test the server and client



    static class GreeterImpl extends GreeterGrpc.GreeterImplBase {
        @Override
        public void sayHello(HelloWorldProto.HelloRequest request, StreamObserver<HelloWorldProto.HelloReply> responseObserver) {
            HelloWorldProto.HelloReply reply = HelloWorldProto.HelloReply.newBuilder()
                    .setMessage("Hello, " + request.getName() + "!")
                    .build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
    }
}