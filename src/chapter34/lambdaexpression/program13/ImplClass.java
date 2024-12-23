package chapter34.lambdaexpression.program13;
/*
* A program to understand how to refer to a particular default method when the same method is found in two interface
*
* */

interface one{
    default void message(){
        System.out.println("Hello from one");
    }
}

interface two{
    default void message(){
        System.out.println("hello from two");
    }
}
public class ImplClass implements one , two {
    @Override
    public void message() {
        two.super.message();
    }

    public static void main(String[] args) {
        ImplClass obj = new ImplClass();
        obj.message();
    }
}
