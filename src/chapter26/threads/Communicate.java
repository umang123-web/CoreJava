package chapter26.threads;

/*
* Program 9: A program where the consumer thread checks whether the
* data production is over or not every 10 milliseconds
*
* This program show how two threads communicate with each other
* this is ineffiecent way of communication
* */

class Producer extends Thread{

//    to add data , we use StringBuffer object

    StringBuffer sb;

//    dataprodover will be true when data production is over

    boolean dataprodover = false;

    public Producer(){
         sb = new StringBuffer(); //allot memory
    }


    @Override
    public void run() {

        //    go on appending data(numbers) to String buffer

        for(int i=1; i<=10; i++){
            try{
                sb.append(i +":");
                Thread.sleep(100);
                System.out.println("appending");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

//            data production is over , so store true into dataprodover
            dataprodover = true;
        }
    }
}

class Consumer extends Thread{
//    create Producer reference to refer to producer object from
//    consumer class

    Producer1 prod;
    public Consumer(Producer1 prod){
        this.prod = prod;
    }


    @Override
    public void run() {
//        if data production is not over , sleep for 10 milliseconds
//        and check
//        again here there is a time delay of several millisecond to receive data

        try{
            while (!prod.dataprodover){
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        when data production is over display data of StringBuffer
        System.out.println(prod.sb);
    }
}
public class Communicate {

    public static void main(String[] args) {
//        producer produces some data which consumer consumes
        Producer1 obj1 = new Producer1();
//        pass Producer object to consumer so that it is then available to consumer
        Consumer1 consumer = new Consumer1(obj1);
//        create two thread and attach to Producer and consumer
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();

    }
}
