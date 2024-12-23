package Chapter17.TypeCasting;
/*
Porgram 3:Narrowing in referenced Data Types
 A program for creating sub class reference which is used to refer to the super class object

 In narrowing we have 0% functionality

*/

import java.io.IOException;

class Three{
    void show1(){
        System.out.println("super class method");
    }

}

class Four extends Three{
    void show2(){
        System.out.println("sub class method");
    }
}


public class Cast1{

    public static void main(String[] args) {
        //o is super class reference

        try {
            Four f = (Four) new Three();
            f.show1();

        }catch (ClassCastException e){
            System.out.println("three cannot be cast to four");
        }
    }
}
