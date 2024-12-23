package Chapter18.AbstractClasses;
/*
Program 1: A program where myclass ' calculate() method is available to all the objects and hence every object
can calculate the square value
 */
class myClass{

    void calculate(double x){
        System.out.println("Calculate cube of x" + (x *x));
    }
}



public class Common {

    public static void main(String[] args) {

        myClass class1 = new myClass();
        myClass class2 = new myClass();
        myClass class3 = new myClass();

        class1.calculate(3);
        class2.calculate(4);
        class3.calculate(5);
    }
}
