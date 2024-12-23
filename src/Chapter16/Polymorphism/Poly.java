package Chapter16.Polymorphism;

//Program :2

/*
Method overriding example and its mean that writing two or more method in super or
sub classes with the same name and same method signature and Jvm find it by which object is called with method


 */



class One{

    void Calculate(double x){
        System.out.println("the value of square of x is:"   + (x *x));
    }

        }

        class Two extends One{

            @Override
            void Calculate(double x) {
                System.out.println("the square root of x is:" + Math.sqrt(x));
            }
        }
public class Poly {

    public static void main(String[] args) {
        Two t = new Two();
        t.Calculate(25);
    }
}
