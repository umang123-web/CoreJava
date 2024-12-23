package chapter34.lambdaexpression.program18;

import java.util.function.Function;

/*
* A program to create a function that return the length of a string
*
*
* */
public class FunctionDemo1 {
    public static void main(String[] args) {

        /*
        * Create a function reference to lambda expression to find length of a string
        * */

        Function<String , Integer> len = (str)->str.length();

//        find the length of the string str;
        String str ="DreamTech Publication";
        System.out.println("Length =" + len.apply(str));

    }
}
