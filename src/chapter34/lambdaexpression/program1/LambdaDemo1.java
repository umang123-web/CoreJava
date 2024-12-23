package chapter34.lambdaexpression.program1;
/*
* A program to create a lambda expression that display a Hello message call and execute the expression
* using functional interface reference
* */

interface MyInter{

    void message();
}
public class LambdaDemo1 {

    public static void main(String[] args) {
// create functional interface reference that refers to lambda expression
        MyInter mi=()->{
            System.out.println("Hello how are you?");
        };
        mi.message();
    }
}
