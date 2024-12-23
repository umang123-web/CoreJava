package Chapter23.TheCollectionFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Program 10: A program that show the use of arrays
 */
public class ArrayDemo {

    public static void main(String[] args) throws IOException {

        //to accept data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //create an array
        int arr[ ] = new int[5];
        //store element into arr[]

        for(int i=0; i<5; i++){
            System.out.println("Enter an integer ");
            arr[i] =Integer.parseInt(br.readLine());

        }

        //display the arr[] contents
        System.out.println("Conent of the array:  ");
        display(arr);


        //sort the arr[] into ascending order
        Arrays.sort(arr);

        //display the sorted contents
        System.out.println("The sorted array: ");
        display(arr);

        //now search for an element
        System.out.println("Which element to search");
        int element = Integer.parseInt(br.readLine());
        int index =Arrays.binarySearch(arr , element);
        if(index < 0){
            System.out.println("element not found");
        }else {
            System.out.println("Element found at location:" + (index +1));
        }
    }

    private static void display(int[] arr) {
        for(int i : arr){
            System.out.println(i);
        }
    }

}
