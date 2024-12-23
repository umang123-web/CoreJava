package chapter34.lambdaexpression.program4;
/*
* A program to access variable of a class and of a method using
* lambda expression
* */
public class LambdaDemo4 {

    int x=10;
//    method in the class
    void method(){
        int x =20;
//        create reference of functional interface to lambda expression
        Runnable r =()->{
            System.out.println("var of the class=" + this.x);
            System.out.println("var of the method=" + x);
        };

//        create a thread and run it
        Thread t = new Thread(r);

        t.start();
    }
    public static void main(String[] args) {

        LambdaDemo4 demo = new LambdaDemo4();
        demo.method();
    }
}
