package chapter26.threads;

/*
* Program 5: A program showingh two threads working simultaneously upon two objects
*
* */


class MyThread3 implements Runnable {

    String str;

    public MyThread3(String str) {
        this.str = str;
    }


    @Override
    public void run() {


        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(str + ":" + i);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

public class Theatre {

    public static void main(String[] args) throws InterruptedException {
        MyThread3 obj1 = new MyThread3("cut the ticket");
        MyThread3 obj2 = new MyThread3("Show the seat");


        Thread t1 = new Thread(obj1);  //here target object
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();


    }
}
