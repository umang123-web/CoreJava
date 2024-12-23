package chapter26.threads;

/*
Program 6: A program showing two thread acting upon a single object

Program 7 A program to synchronize the thread acting on the same object. The synchronized
block in the program can be executed by only one thread

*
*
* */


class Reservation implements Runnable{
    int available =1;
    int wanted;

    Reservation(int available){
   wanted = available;
    }

    @Override
    public void run() {

        synchronized (this) {
            System.out.println("Available Berth:" + available);
            if (available >= wanted) {
//            get the name of passenger
                String name = Thread.currentThread().getName();
                System.out.println(wanted + "Berth reserved for" + name);

                try {
                    Thread.sleep(1500);
                    available = available - wanted;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

//            if available berth are less then sorry
            } else {
                System.out.println("Sorry no berth");
            }
        }
    }
}
public class Safe {


    public static void main(String[] args) {
        Reservation reservation = new Reservation(1);

        Thread t1 = new Thread(reservation);
        Thread t2 = new Thread(reservation);

        t1.setName("first Person");
        t2.setName("second person");

        t1.start();
        t2.start();
    }
}
