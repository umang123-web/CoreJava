package Chapter23.TheCollectionFramework;

/*
Program 11 : A program that shows sorting using comparator
 */

//to sort into ascending order


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Ascend implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}

class Descend implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1
        );
    }
}

public class Array1 {

    public static void main(String[] args) throws IOException {
        //to accept the array element from keyboard

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many element ?");
        int  size = Integer.parseInt(br.readLine());


        //create an array to store Integer type objects

        Integer arr [] = new Integer[size];
        //below we pass int values to the array but they are converted
        //Integer object and then stored

        for(int i=0; i<size; i++){
            System.out.print("Enter int: ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        //sort the array in ascending order
        Arrays.sort(arr , new Ascend() );
        System.out.println("\n sorted in Ascending order");
        display(arr);


        System.out.println("*********************");


        //sort the array in descending order
        Arrays.sort(arr , new Descend());
        System.out.println("\n sorted in Descending order");
        display(arr);
    }

    private static void display(Integer[] arr) {
        for(int i : arr){
            System.out.println(i + "\t");
        }
    }
}
