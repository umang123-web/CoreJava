package chapter26.threads;

/*
* Program 11: A program to understand the thread priorities. The thread with higher priority
* number will complete its execution first
* */
class MyClass extends Thread{

    int count =0;
    public void run(){
        for(int i=1; i <=10; i++){
            count++; //count number upto 1000;
//            display which thread has complete counting and its priority
            System.out.println("completed thread: " +  Thread.currentThread().getName());
            System.out.println("Its priority: " +  Thread.currentThread().getPriority());
        }
    }
}


public class Prior {

    public static void main(String[] args) {

        MyClass myclass = new MyClass();
        Thread t1 = new Thread(myclass , "one");
        Thread t2 = new Thread(myclass , "two");

//        set priorities for them
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY); //this mean priority no. 5
//        start first f1 and then f2
        t1.start();
        t2.start();



    }

}
