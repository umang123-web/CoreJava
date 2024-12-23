package Chapter23.TheCollectionFramework;
/*
Program 15: An Arraylist handling a group of Employee class object
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Employees{
     int id;
     String name;
     String address;


     public Employees(int id , String name , String address){
         this.id=id;
         this.name = name;
         this.address = address;
     }

     void display(){
         System.out.println("ID:" + id);
         System.out.println("name: "  + name);
         System.out.println("address:"  + address);
     }

}
public class Emplist {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int id;
        String name;
        String address;

        //create an arraylist to store data
        ArrayList<Employees> employees = new ArrayList<>();

        //accept 5 employee s' details and store into arr1

        for(int i=0; i<5; i++){
            System.out.println("Enter id:");
            id = Integer.parseInt(br.readLine());

            System.out.println("Enter name:");
            name = br.readLine();

            System.out.println("Enter address:");
            address = br.readLine();

            //create Employee object with accepted list

            Employees emp = new Employees(id , name , address);

            employees.add(emp);

        }

        //now search for an employee id

        System.out.println("Enter id to search: ");
        id = Integer.parseInt(br.readLine());

        //found becomes true if employee id is found in

        boolean found = false;

        //search all element in employees

        for(int i =0; i<employees.size(); i++){
            //get() method of arraylist will return i-th employee
            Employees obj = employees.get(i);
            if(id == obj.id){
                obj.display();
                found =true;
            }
        }

        if(!found){
            System.out.println("Employee not found");
        }
    }
}
