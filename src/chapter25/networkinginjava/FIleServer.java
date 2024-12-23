package chapter25.networkinginjava;

import javax.xml.crypto.Data;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
*
* Program 8: A program  that accepts the filename and check its existence. When
* the file exists at server side it sends its contents to the client
*
*
* */
public class FIleServer {


    public static void main(String[] args) throws IOException {
//        create server socket
        ServerSocket ss = new ServerSocket(8888);
//        make the server wait till a client accepts connection
        Socket s = ss.accept();
        System.out.println("connection established");
//        to accept filename from client
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//      to send file contents to client

     DataOutputStream dos = new DataOutputStream(s.getOutputStream());
//     read the filename from the client
        String fname = br.readLine();

        FileReader fr = null;
        BufferedReader file = null;
        boolean flag;

//        create File class object with filename
        File f = new File("fname");
//        test if the file exists or not
        if(f.exists()) flag = true;
        else flag = false;

//        if file exists send "Yes" to client else send "No"
        if(flag == true) dos.writeBytes("Yes" + "\n");
        else dos.writeBytes("No" + "\n");


        if(flag ==true){
//            attach file to the FileReader to read data
            fr = new FileReader(fname);
//            attach FileReader to BufferedReader
            file = new BufferedReader(fr);

            String str;
//            read from BufferedReader and write to DataOutputstream
            while ((str = br.readLine())!=null){
                dos.writeBytes(str + "\n");
            }
            file.close();
            dos.close();
            s.close();
            ss.close();
        }

    }

}
