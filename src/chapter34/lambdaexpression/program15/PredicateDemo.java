package chapter34.lambdaexpression.program15;

import java.util.function.Predicate;

/*
* A program to create a predicate and pass it to a method that displays number greater than 15
*
* */
public class PredicateDemo {

    public static void main(String[] args) {
//        take a group of Integer Object in an array
        Integer[] arr ={8,9 ,10 , 11, 12 , 13 , 14 , 15};

//        create Predicate reference to lambda expression

        Predicate<Integer> gt =(i)->i>10;
        System.out.println("Number greater than 10:");
//        call the method and pass predicate reference

    MyMethod(gt , arr);

    }

    private static void MyMethod(Predicate<Integer> gt, Integer[] arr) {
        for(Integer i : arr){
            if(gt.test(i)){
                System.out.println(i + " ");
            }
        }
    }


}
