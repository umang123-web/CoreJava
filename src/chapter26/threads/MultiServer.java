package chapter26.threads;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
/*
* Program 13: A program to create 2 server with 2 threads to communicate with several cleints
*
*
* */
public class MultiServer implements  Runnable{
    static ServerSocket ss;
    static Socket s;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for(;;) {


            try {

                System.out.println("Thread" + name + "ready to acceptss");
                s = ss.accept();
                //for sending message
                PrintStream ps = new PrintStream(s.getOutputStream());
                ps.println("Thread:" + name + "contacted you");
                ps.close();
                s.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        MultiServer server = new MultiServer();
        ss = new ServerSocket(999);
//        create 2 thread
        Thread t1 = new Thread(server , "one");
        Thread t2 = new Thread(server , "two");

        t1.start();
        t2.start();

    }
}
