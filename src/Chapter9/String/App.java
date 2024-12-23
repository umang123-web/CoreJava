package Chapter9.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many String?");

        int n = Integer.parseInt(br.readLine());

        String [] str = new String[n];

        for(int i=0; i<n; i++) {
            System.out.println("Enter a String:  ");
            str[i] = br.readLine();
        }

        System.out.println("Enter string to search:");
        String search = br.readLine();
            boolean found = false;


               for(int i=0; i<n; i++){
                   if(search.equalsIgnoreCase(str[i])){
                       System.out.println("found at position:" + (i+1));
                       found = true;
                   }
               }

               if(!found){
                   System.out.println("not found in the group");
               }



    }
}
