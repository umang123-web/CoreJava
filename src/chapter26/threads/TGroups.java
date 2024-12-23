package chapter26.threads;

/*
* Program 12: A program to demonstrate the creation of thread groups and
* some method which act on thread group
* */


class Reservation1 extends  Thread{

    @Override
    public void run() {
        System.out.println("I am a Reservation Thread");
    }
}

class Cancellation extends  Thread{
    @Override
    public void run() {
        System.out.println("I am  a cancellation thread");
    }
}
public class TGroups {

    public static void main(String[] args) {

        Reservation1 reservation1 = new Reservation1();
        Cancellation cancel = new Cancellation();
//        create a Threadgroup with name
        ThreadGroup tg = new ThreadGroup("first group");

//        create 2 threads and add them to second group
        Thread t1 = new Thread(tg , reservation1 , "first thread");
        Thread t2 = new Thread(tg , reservation1 , "second thread");

//        create another thread group tg1 as a child to tg
        ThreadGroup tg1 = new ThreadGroup(tg , "second group");

        Thread t3 = new Thread(tg1 , cancel, "third thread");
        Thread t4 = new Thread(tg1 , cancel , "fourth thread");

        //     find parent group of tg1
        System.out.println("parent of tg1: " + tg1.getParent());

//        set max priority to tg1 as 7
        tg1.setMaxPriority(7);

//        know the thread group of t1 and t3

        System.out.println("Thread group of t1 :" + t1.getThreadGroup());
        System.out.println("Thread group of t2:  " + t3.getThreadGroup());

        t1.start();
        t2.start();
        t3.start();
        t4.start();

//        find how many threads are actively running
        System.out.println("no of thread active in tg:" + tg.activeCount());

    }
}
