package chapter34.lambdaexpression.program17;

import java.util.function.Predicate;


/*
* A program to understand how to join two predicates
*
* */
public class PredicateDemo5 {

    public static void main(String[] args) {
        Integer[] arr={8, 9 , 10 , 11 , 12 , 13 , 14 , 15};

        Predicate<Integer> gt , lt;

        //        lambda expression to return true if number > 10
        gt=(n)->n>10;

//        lambda expression to return true if number <15
        lt=(n)->n<15;

        System.out.println("Numbers > 10 and < 15:");
       display(gt.and(lt) , arr);

        System.out.println("\nnumber<=10 and >=15 ");
        display(gt.and(lt).negate() , arr);
    }



    private static void display(Predicate<Integer> p, Integer[] arr) {

    for(int i :arr){
        if(p.test(i)){
            System.out.println(i + " ");
        }
    }
    }
}
