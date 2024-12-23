package chapter25.networkinginjava;

import java.io.*;
import java.net.Socket;

/*
* Program 9: A client
* */
public class FileContent {
    public static void main(String[] args) throws IOException {

//        create client socket
        Socket s = new Socket("localhost" , 8888);
//        accept filename from keyboard

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter filename : " );
        String fname = kb.readLine();

//        send filename to the server using DataOutputStream
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeBytes("fname" +"\n" );
//       to read data coming from the server
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str;

//        read first line from server into str
        str = br.readLine();
//        if file is found server return yes else  no
        if(str.equals("yes")){
//            read and display the file contents coming from server
            System.out.println(str);

//            close connection by closing the streams
            kb.close();
            dos.close();
            br.close();
            s.close();
        }else{
            System.out.println("file not found");
        }
    }
}
