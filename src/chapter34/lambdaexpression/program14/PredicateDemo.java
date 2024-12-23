package chapter34.lambdaexpression.program14;

import java.util.function.Predicate;

/*
* A program using predicate to know whether a given number is greater than 10 or not
*
* */
public class PredicateDemo {

    public static void main(String[] args) {
//        Use Predicate  reference to show the lambda expression

        Predicate<Integer> gt = (i)->i>10;

//        call test() method of Predicate that return true or false
        boolean result = gt.test(15);

        System.out.println("Greater than result :"  + result);
    }
}
