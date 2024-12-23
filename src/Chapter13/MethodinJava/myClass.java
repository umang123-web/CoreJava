package Chapter13.MethodinJava;


/*
A program to create a factory method to display course fee depending on the user s'
choice
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface  fees{
    double showfees();
}


class CSE implements fees{


    @Override
    public double showfees() {
        return 60000.00;
    }
}

class ECE implements fees{

    @Override
    public double showfees() {
        return 55000.00;
    }
}

class CourseFees{
    public static fees getfees(String course){
        if(course.equalsIgnoreCase("CSE")){
            return new CSE();
        } else if (course.equalsIgnoreCase("ECE")) {
            return new ECE();

        }else {
            return null;
        }


    }
}


public class myClass {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter course name:");

        String name = br.readLine();

        fees f = CourseFees.getfees(name); //getfees is a factorymethod

        System.out.println("The fees is rps." + f.showfees());

    }

}
