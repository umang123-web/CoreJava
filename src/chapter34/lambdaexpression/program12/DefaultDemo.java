package chapter34.lambdaexpression.program12;
/*
* A program to understand how to use default method of an interface
*
* */

interface MyInter{
    int add(int x , int y);

    default int mul(int x , int y){
        return (x*y);
    }
}
class A implements MyInter{

    @Override
    public int add(int x, int y) {
        return x+y;
    }
}
public class DefaultDemo  {

    public static void main(String[] args) {
        MyInter mi = new A();
        System.out.println("sum= " + mi.add(10 , 15));

//        default method is by default available in implementaion class
        System.out.println("product=" + mi.mul(10 , 15));
    }

}
