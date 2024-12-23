package chapter25.networkinginjava;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
Program 4: A program to create a server for the purpose of sending some string to the client
 */
public class Server1 {

    public static void main(String[] args) throws IOException {

        //create a server socket with some port number
        ServerSocket ss = new ServerSocket(7777);

        //let the server wait till a client accept connection

        Socket s =ss.accept();
        System.out.println("connection established");
        //attach output stream to the server socket
        OutputStream obj = s.getOutputStream();
        //attach print stream to send data to the socket
        PrintStream print = new PrintStream(obj);
        //send 2 strings to the client
        String str = "Hello clients";
        print.println(str);
        print.print("bye");

        //close connection by closing the stream and sockets
        print.close();
        ss.close();
        s.close();
    }
}
