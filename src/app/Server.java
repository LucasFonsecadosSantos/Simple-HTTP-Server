package app;

import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.io.IOException;
import utilies.Logger;
import utilies.ClientHandler;

public class Server {
    private ServerSocket serverSocket;
    private Socket  clientSocket;
    private Logger logger;
    private int portNumber;

    public Server(int portNumber) {
        this.portNumber = portNumber;
        try {
            this.serverSocket = new ServerSocket(this.portNumber);
        } catch(IOException e) {
            System.out.println(e.toString());
        }
    }

    public Server() {
        this.portNumber = 80;
        try {
            this.serverSocket = new ServerSocket(portNumber);
        } catch(IOException e) {
            System.out.println(e.toString());
        }
    }

    public void execute() {
        System.out.println("Listening...");
        while(true) {
            try {
                //this.clientSocket = this.serverSocket.accept();
                // System.out.println(this.clientSocket.getInetAddress());
                // new ClientHandler(this.clientSocket).start();
                break;
            } catch(Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}