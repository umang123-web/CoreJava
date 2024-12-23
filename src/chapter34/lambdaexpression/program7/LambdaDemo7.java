package chapter34.lambdaexpression.program7;
/*
* A program to display a message , where a separate implementation class for Runnable interface
* is created
* */

class ImplClass implements Runnable{

    @Override
    public void run() {
        System.out.println("This is my thread");
    }
}
public class LambdaDemo7 {
    public static void main(String[] args) {
        Thread obj = new Thread(new ImplClass());

     obj.start();
    }

}
