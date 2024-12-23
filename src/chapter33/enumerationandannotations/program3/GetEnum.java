package chapter33.enumerationandannotations.program3;
/*
* A program to know how to create an enumeration with constant , instance variable , constructor and a method
*
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum Icecream{

//    constant with values
    vanilla(20.00) , chocolate(22.00) , strawberry(23.00) , Raspberry(40.00);


//    an instance variable
    private double price;
    Icecream(double p){
        price =p;

    }

//    a static method to display the price upon taking the sequence number
    static void getPrice(int i){
        Icecream icecreams[ ] = Icecream.values();
        System.out.println("Pay rs." +icecreams[i].price );
    }
}
public class GetEnum {

    public static void main(String[] args) throws IOException {
//        display all teh icecream available from the enumeration
        System.out.println("AVAILABLE ICECREAM");

        for(Icecream ice : Icecream.values()){
//            ordinal() method starts from counting 0
            int no = ice.ordinal();
            System.out.println(no + " " + ice);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Your choice: ");
        int choice =Integer.parseInt(br.readLine());
        Icecream.getPrice(choice);
    }
}
