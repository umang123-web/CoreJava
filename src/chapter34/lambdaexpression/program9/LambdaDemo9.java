package chapter34.lambdaexpression.program9;
/*
* A thread program to display a message using lambda expression
*
* */
public class LambdaDemo9 {

    public static void main(String[] args) {
//        lambda expression to implement the run method
        Thread thread = new Thread(()->{
            System.out.println("I am  a thread");
        });
        thread.start();
    }
}
