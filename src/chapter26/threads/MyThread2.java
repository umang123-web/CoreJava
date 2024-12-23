package chapter26.threads;


/*
* Program 4: A program showing execution of multiple tasks with a single thread
*
* */


class Single implements Runnable{

    @Override
    public void run() {
        task1();
        task2();
        task3();
    }

    void task1(){
        System.out.println(" executing task1");

    }

    void task2(){
        System.out.println("executing task 2");
    }

    void task3(){
        System.out.println("executing task 3");
    }
}
public class MyThread2 {
    public static void main(String[] args) {

        Single single = new Single();
        Thread thread = new Thread(single);
        thread.start();
    }
}
