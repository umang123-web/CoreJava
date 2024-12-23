package chapter35.streamapi.program1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* A program to create a stream with the elements of an ArrayList and get the element which are greater than 5
* into a new list
*
*
* */
public class Convert1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<10; i++){
            list.add(i);
        }

       // Stream<Integer> list1 = list.stream();

        //List<Integer> sm = list1.filter(i->i>5).collect(Collectors.toList());


        list.stream().filter(i->i>5).collect(Collectors.toList()).forEach(System.out::println);
    }
}
