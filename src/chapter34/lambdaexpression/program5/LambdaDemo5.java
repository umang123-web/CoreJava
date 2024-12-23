package chapter34.lambdaexpression.program5;
/*
* A program to calculate area of a circle by passing a lambda expression to a method
*
* */

interface Circle{
    void calculate(double radius);
}

public class LambdaDemo5 {
// a method with functional interface with reference ref as its argument

    void circleArea(double radius , Circle ref){
        ref.calculate(radius); //this will execute the lambda expression
    }
    public static void main(String[] args) {

        LambdaDemo5 demo = new LambdaDemo5();
//        let the functional implements calculate (radius) method
        Circle ref =(r)->{
            System.out.println("Area=" + Math.PI *r *r);
        };
        demo.circleArea(20 , ref);
    }
}
