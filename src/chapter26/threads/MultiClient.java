package chapter26.threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

/*
* Program 14: A program to create a client that receives from the server above
*
* */
public class MultiClient {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost" , 999);
//        to accept the data from server
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//        receive data as long as server does not close client socket
        String str;

        while ((str = br.readLine())!=null){
            System.out.println(str);
        }
        br.close();
        s.close();
    }
}
