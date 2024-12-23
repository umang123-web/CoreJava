package chapter26.threads;

/*
* Program 8: A program depiciting a situation in which deadlock can occur
* */

class BookTicket extends Thread{

//    we are assuming train , compartment as an object

    Object train , compartment;

    public BookTicket(Object train , Object compartment){
        this.train = train;
        this.compartment = compartment;
    }
    @Override
    public void run() {

        synchronized (train) {

            System.out.println("bookticket locked on train");
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);}
            System.out.println("Bookticket now waiting to lock on compartment");
        }
        synchronized (compartment){
            System.out.println("Bookticket locked on compartment");
        }
    }
}

class CancelTicket extends Thread{

    Object train , compartment;

    public CancelTicket(Object train , Object comp){
        this.train = train;
        this.compartment = comp;
    }
    @Override
    public void run() {
//        synchronized (compartment)
        synchronized (train){
            System.out.println("cancel ticket locked on train");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("cancel ticket now waiting for compartment");
            synchronized (compartment){
                System.out.println("cancel ticket locked on compartment ");
            }
        }
    }
}
public class Deadlock {
    public static void main(String[] args) {
        Object train = new Object();
        Object compartment = new Object();

//        create objects of BookTicket class and cancelTicket class

        BookTicket t1 = new BookTicket(train , compartment);
        CancelTicket t2 = new CancelTicket(train , compartment);
        Thread tw1 = new Thread(t1);
        Thread tw2 = new Thread(t2);
        tw1.start();
        tw2.start();

    }
}
