package Chapter23.TheCollectionFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/*

Program 8 : A program that shows the use of HashMap class
 */
public class HashMapDemo {

    public static void main(String[] args) throws IOException {

        //create hashmap

        HashMap<String , Long> map = new HashMap<>();

        //vars
        String name , str;
        long phone;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            System.out.println("1 Enter phone entries");
            System.out.println("2 Looked in the book");
            System.out.println("3 Display names in the book");
            System.out.println("4 exit");


            System.out.println("Enter your choice:   ");
            int n = Integer.parseInt(br.readLine());

            switch (n){
                case 1:
                    System.out.println("Enter name: ");
                    name = br.readLine();
                    System.out.println("Enter phone no");
                    str = br.readLine();
                    phone = new Long(str);
                    //store name and phone into HashMap
                    map.put(name , phone);
                    break;

                case 2:
                    System.out.println("Enter name: ");
                    name = br.readLine();
                    name = name.trim(); //remove uneccessary
                    //pass name and get phone
                    phone = map.get(name);
                    System.out.println("Phone: " + phone);
                    break;

                case 3:
                    //use keyset to display the names
                    //create Hashset object to store names and refer to set reference
                    Set<String> set = new HashSet<String>();
                    set = map.keySet();
                    System.out.println(set);
                    break;

                case 4: return;
            }



        }
    }


}
