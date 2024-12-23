package Chapter24.StreamAndFiles;

import java.io.*;

/*
program 12: Write a program to show serialization of objects
 */
public class StoreObj {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Connect FileOutputstream to the objfile.txt

        FileOutputStream oos = new FileOutputStream("objfile.txt");

        //connect objectoutputstream to the fileoutputstream

        ObjectOutputStream oob = new ObjectOutputStream(oos);

        //ask how many employees
        System.out.println("How many employees?  ");
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            //create a Employee Object
            Employee employee = new Employee();

            //store data into e

            employee.getData();
            //write data from e into objfile.txt
              oob.writeObject(employee);


        }

        oos.close();

    }
}
