package Chapter12.ClassesAndObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Person{
    private String name;
    private int age;

    public Person(String s , int i){
        name =s;
        age =i;

    }

    void check(){
        if(age <=30){
            System.out.println(name + "is young");
        }else if(age <=50){
            System.out.println(name + "is old now");
        }else {
            System.out.println(name + "is old");
        }
    }


}



public class Demo {

    public static void main(String args []) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = args[0];
        int i =Integer.parseInt(args[1]);


        Person person = new Person(s , i);
        person.check();

    }
}
