package chapter34.lambdaexpression.program8;
/*
* A thread program to display a message by using anonymous inner class
* */
public class LambdaDemo8 {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("Hello I am  a thread");
            }
        });
            thread.start();
    }


}
