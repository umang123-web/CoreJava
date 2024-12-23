package chapter34.lambdaexpression.program2;
/*
* A program to create and execute a lambda expression that adds two integer
* */

interface MyInter{
    void add(int a , int b);
}
public class LambdaDemo2 {

    public static void main(String[] args) {

        MyInter mi =(int a , int b)->{
            System.out.println("the sum of 2 numbers is:" + (a+b));
        };

        mi.add(10 , 30);
    }
}
