package Chapter23.TheCollectionFramework;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Enumeration;
import java.util.Hashtable;

/*
Program 9:A program that show the HashTable class
 */
public class HashTableDemo {

    public static void main(String[] args) throws IOException {
        Hashtable<String , Integer> ht = new Hashtable<>();
        ht.put("Sachin" , 77);
        ht.put("Gavaskar" , 50);
        ht.put("Kapil" , 45);
        ht.put("Ajay" , 30);


        //Display all the player name with enumeration\

        Enumeration e = ht.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        //accept player name with keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter player name: ");
        String name = br.readLine();
        name = name.trim();

        //get scores of the player

        Integer score = ht.get(name);
        if(score !=null){

            //convert score from Integer object to int value
            int sc = score.intValue();
            System.out.println(name +  "scored:"  + sc);

        }

    }
}
