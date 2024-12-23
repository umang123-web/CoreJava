package chapter35.streamapi.program2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
*
* A program to retrieve the number from an ArrayList and convert the resultant stream into an
* array
* */
public class Convert2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<10; i++){
            list.add(i);
        }

        //Stream<Integer>sm = list.stream();
        /*
        *
        * filter the element which are lesser than 5 and collect
        * them into an Integer type array using toArray(Integer[]::new)
        * */



//        Integer[] arr =sm.filter(i->i<5).toArray(Integer[]::new);

//        for(Integer i:arr){
//            System.out.println(i);
//

        Integer[]arr = list.toArray(Integer[]::new);


        Arrays.stream(arr).filter(i->i<5).collect(Collectors.toList()).forEach(System.out::println);

    }

}
