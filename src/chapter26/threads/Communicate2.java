package chapter26.threads;

/*
* Program 10: A program such that the consumer thread is informed immediately
* when the data production is over
* */

class Producer1 extends Thread{

//    to add data , we use StringBuffer object

    StringBuffer sb;

//    dataprodover will be true when data production is over

    boolean dataprodover = false;

    public Producer1(){
         sb = new StringBuffer(); //allot memory
    }


    @Override
    public void run() {

        //    go on appending data(numbers) to String buffer

        synchronized (sb) {
            for (int i = 1; i <= 10; i++) {
                try {
                    sb.append(i + ":");
                    Thread.sleep(100);
                    System.out.println("appending");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
//            data production is over , so notify to consumer thread
            sb.notify();
        }
    }
}

class Consumer1 extends Thread{
    Producer1 prod;
    public Consumer1(Producer1 prod){
        this.prod = prod;
    }


    @Override
    public void run() {

//        wait till notification is received from producer
//        thread here
//        there is no wastage of time of even a single millisecond data


        synchronized (prod.sb) {
            try {
                prod.sb.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

//        when data production is over display data of StringBuffer

            System.out.println(prod.sb);
        }
    }
}
public class Communicate2 {

    public static void main(String[] args) {
//        producer produces some data which consumer consumes
        Producer1 obj1 = new Producer1();
//        pass Producer object to consumer so that it is then available to consumer
        Consumer1 consumer = new Consumer1(obj1);
//        create two thread and attach to Producer and consumer
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(consumer);

        t2.start(); //consumer waits
        t1.start(); //producer starts production

    }
}
