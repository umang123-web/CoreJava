package Chapter21.ExceptionHandling;

/*
Program 3: An employee get increment of 15% in his salary. And the programmer want to calculate his
incremented salary.The programmer has used wrong formula. Where he is calculating the increment only not the incremented
salary.

Logical error
 */
public class Err {
    public static void main(String[] args) {
        double sal = 5000.00;
        sal = sal * 15/100;   //wrong use : sal +=sal * 15/100;
        System.out.println("Incremented salary:"  + sal);

    }


}
