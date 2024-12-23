package chapter26.threads;

/*
* Program 2: A program to create MyThread class with run() method and then attach
* a thread to this MyThread class object
*
* */


class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=1; i<1000; i++){
            System.out.println(i);
        }
    }
}

public class Demo1 {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        //thread.run();

//        create a thread and attach it to the object of MyThread.class
        Thread thread1 = new Thread(thread);
        thread1.start();
    }

}
