package chapter35.streamapi.program4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* A program to understand how to perform some important operations on stream
* using Stream class Method
*
* */
public class StreamOperations {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("USA" , "China" , "Brazil" , "London" ,"" , "India");

        long n =list.stream().filter(x->x.length()>4).count();
        System.out.println("No of strings starting with length more than 4:" + n);

        System.out.println("*****************");

        n=list.stream().filter(x->x.startsWith("U")).count();

        System.out.println("No of String starting with U:" + n);

//        remove all empty string from the list and collect them into another list

        System.out.println("***********************");
        List<String> list2 = list.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
        System.out.println("The list after removing the empty string:\n" + list2);


//        convert all String to capital letter and collect them into an array

        System.out.println("**************************");
        String[] arr =list2.stream().map(x->x.toUpperCase()).toArray(String[]::new);
        System.out.println("Array of sorted string in uppercase:");
        for(String i: arr){
            System.out.println(i);
        }

    }
}
