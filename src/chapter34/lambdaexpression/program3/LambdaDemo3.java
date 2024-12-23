package chapter34.lambdaexpression.program3;
/*
* A program to create a lambda expression that calculates and return the square root value of a
* given number
*
* */
interface MyInter{
    double doublesquareroot(double num);
}
public class LambdaDemo3 {

    public static void main(String[] args) {
        MyInter mi =(double x)->{
            return Math.sqrt(x);
        };

        System.out.println(mi.doublesquareroot(40));

    }
}
