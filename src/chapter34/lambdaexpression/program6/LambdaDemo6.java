package chapter34.lambdaexpression.program6;
/*
* A program to display a message using a thread
* */
public class LambdaDemo6  implements Runnable{
    @Override
    public void run() {
        System.out.println("This is from thread");
    }

    public static void main(String[] args) {
        LambdaDemo6 demo = new LambdaDemo6();
        Thread obj = new Thread(demo);
        obj.start();
    }
}
