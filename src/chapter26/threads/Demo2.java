package chapter26.threads;

/*
* Program 3: Rewrite program 2 showing how to terminate the thread by pressing the enter button
* press Enter button to stop the thread at any time
* */

import java.io.IOException;

class Thread2 implements Runnable{

    boolean stop = false;

    @Override
    public void run() {
        for(int i=1; i<100000; i++){
            System.out.println(i);
            if(stop) return; //come out from run
        }
    }
}
public class Demo2 {

    public static void main(String[] args) throws IOException {
        Thread2 thread = new Thread2();

        Thread thread1 = new Thread(thread);
        thread1.start();
//        stop the thread when enter key is pressed
        System.in.read();
        thread.stop=true;


    }

}
