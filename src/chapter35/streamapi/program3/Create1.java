package chapter35.streamapi.program3;

import java.util.stream.Stream;

/*
* A program to understand how to create stream objects using the stream.of() method
*
* */
public class Create1 {


    public static void main(String[] args) {
        Stream<Integer> sm=Stream.of(10 , 11 , 12 , 13 ,14 , 15 );
        sm.forEach(System.out::println);

        Float[] fl = {1.1f , 2.2f , 3.3f , 4.4f};

        Stream<Float> sm2 = Stream.of(fl);
        sm2.forEach(System.out::println);

        /*
        * create the stream from random number
        * */


        System.out.println("**************************");
        Stream<Double> dl = Stream.generate(()->{return  Math.random();});

        dl.forEach(System.out::println);

    }
}
