package chapter34.lambdaexpression.program19;
/*
* A java program to understand how to use double colon operator as a reference to a method
*
* */
public class DColon1 {

    static  void display(){
        System.out.println("Hello from display");
    }
    public static void main(String[] args) {

//        lambda expression represents the run() method from Runnable
        Runnable r1=()-> System.out.println("Hello from lambda");
        r1.run();

//        double colon refers that display() method of DColonDemo1 class
        Runnable r2 =DColon1::display;
        r2.run();
    }

}
