package Chapter18.AbstractClasses;


abstract  class myclass{

    abstract void calculate(double x);
}

class Sub1 extends myclass{

    @Override
    void calculate(double x) {
        System.out.println("the square of sum is:" + (x *x) );
    }
}


class Sub2 extends myclass{

    @Override
    void calculate(double x) {
        System.out.println("the sqrt of sum is:"  + (Math.sqrt(x)));
    }
}


class Sub3 extends myclass{

    @Override
    void calculate(double x) {
        System.out.println("the cube of sum is:"   + (x * x*x));
    }
}
public class Different {

    public static void main(String[] args) {

        Sub1 sub1 = new Sub1();
        Sub2 sub2 = new Sub2();
        Sub3 sub3 = new Sub3();

        sub1.calculate(3);
        sub2.calculate(4);
        sub3.calculate(5);
    }

}
