package Chapter23.TheCollectionFramework;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Program 1: A program to store a group of object into array and retrieve the object data and display
 */
class Employee{
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayData(){
        System.out.println(id + "\t"  + name);
    }
}
public class Group {


    public static void main(String[] args) throws IOException {

//to accept data from keyboard

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //create Employee type array with size 5
        Employee [] arr = new Employee[5];

        //store 5 employee data into the array
        for(int i=0; i<5; i++){

            System.out.println("Enter id:  ");
            int id = Integer.parseInt(br.readLine());

            System.out.println("Enter name :  ");
             String name = br.readLine();

          arr[i] =new Employee(id , name );
        }

        System.out.println("\n The employee data is:");

        //display the employee data from the array
        for(int i=0; i<arr.length; i++){
            arr[i].displayData();
        }
    }
}
