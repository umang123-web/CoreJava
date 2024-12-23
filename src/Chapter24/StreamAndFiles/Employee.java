package Chapter24.StreamAndFiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Calendar;
/*
Program 11: A program to create Employee class whose objects are to be stored into a file
 */
public class Employee implements Serializable {

    int id;
    String name;
    float sal;
    Calendar doj;

    void displayData(){
        int yy =doj.get(Calendar.YEAR);
        int mm = doj.get(Calendar.MONTH);
        mm++; //since Jan is stored as
        int dd = doj.get(Calendar.DATE);

        System.out.printf("%-10d %s %10.2f  %2d-%2d-%4d\n ", id,name,sal,dd,mm,yy );
    }

    void getData() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Enter employee id:  ");
        id = Integer.parseInt(br.readLine());
        System.out.print("Enter name?:   ");
        name = br.readLine();
        System.out.print("Enter Salary?:  ");
        sal = Float.parseFloat(br.readLine());

        //accept date of joining from keyboard

        System.out.print("Enter date of joining: ");
        System.out.print("Enter day:  ");
        int dd = Integer.parseInt(br.readLine());
        System.out.println("Enter month:   ");
        int mm = Integer.parseInt(br.readLine());
        mm--;  //since jan is stored as 0
        System.out.print("Enter year:  ");
        int yy = Integer.parseInt(br.readLine());

        //store date of joining into Calender Object

        doj = Calendar.getInstance();
        doj.set(yy , mm , dd);

    }
}
