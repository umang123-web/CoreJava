package chapter25.networkinginjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/*
program 5: A program to create client side program which accept all the strings sent by server
 */
public class Client1 {

    public static void main(String[] args) throws IOException {
        //create client socket with same port number
        Socket s = new Socket("localhost",7777);

        //to read data coming from server attach InputStream to the socket
        InputStream inp = s.getInputStream();

        //to read data from the socket into the client , use BufferedReader

        BufferedReader br = new BufferedReader(new InputStreamReader(inp));

        //receive Strings
        String str;
        while ((str = br.readLine())!=null){
            System.out.println("From Server: " + str);
            //close connection by closing the stream and sockets

        }
        br.close();
        s.close();
    }
}
