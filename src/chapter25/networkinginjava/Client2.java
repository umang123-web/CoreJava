package chapter25.networkinginjava;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/*
* Program 7: A program to create a client which first connect to a server then
* starts the communication by sending a string to the server. The server send response
* to the client when exit is typed at client side the program terminates
* */
public class Client2 {

    public static void main(String[] args) throws IOException {
//        Create client socket

        Socket s = new Socket("localhost" , 880);
//        to send data to the server
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
//        to read data from the server
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String str , str1;
        //repeat as long as exit is not typed at client
        while (!(str = kb.readLine()).equals("exit")){
            dos.writeBytes(str + "\n"); //send to server
            str1 = br.readLine(); //receive from server
            System.out.println(str1);

        }

//        close connection

        dos.close();
        br.close();
        kb.close();
        s.close();


    }
}
