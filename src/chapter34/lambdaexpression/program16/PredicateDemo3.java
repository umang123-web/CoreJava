package chapter34.lambdaexpression.program16;

import java.util.function.Predicate;

/*
* A program to create a predicate that displays all number and even numbers from a group
* of a given numbers
*
* */
public class PredicateDemo3 {
    public static void main(String[] args) {
        Integer arr[] ={8, 9 , 10 , 11 , 12 , 13 , 14 , 15};

//        create Predicate reference
        Predicate<Integer> all , evens;

//        lambda expression to return true upon taking  number
        all=(n)->true;

        evens=(n)->n%2==0;

        System.out.println("All numbers");
        display(all , arr);


        System.out.println("All even numbers");
        display( evens , arr);

    }
    private static void display(Predicate<Integer> p , Integer[] arr){
        for(Integer i :arr){
            if(p.test(i)){
                System.out.println(i + " ");
            }
        }
    }

}
