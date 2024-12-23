package chapter25.networkinginjava;
/*
* Program 6: A program to create a server such that the server receives
* data from the client using BufferedReader and then send reply to the client
* using print stream
* */

import javax.sound.midi.ShortMessage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) throws IOException {


//        Create server socket
        ServerSocket ss = new ServerSocket(880);
        Socket s = ss.accept();
//        connect it to client socket
        System.out.println("connection established");
//        to send data to the client
        PrintStream ps = new PrintStream(s.getOutputStream());
//        to read data from the keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

         while (true){     //server executes continously
             String str , str1;

//             repeat as long as client does not send null String
             while ((str = br.readLine()) !=null){   //read from client

                 System.out.println(str);
                 str1 = kb.readLine();
             }

              ps.close();
             br.close();
             kb.close();
             ss.close();
             s.close();
             System.exit(0);
         }



    }
}
