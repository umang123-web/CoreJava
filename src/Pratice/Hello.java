package Pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hello {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a fibonacci number");

        int n = Integer.parseInt(br.readLine());

        long f1 = 0;
        long f2 = 1;

       long f = f1 + f2;
       System.out.println(f);

       int count =3;

       while (count <n){
           f1 = f2;
           f2 =f;
           f = f1+f2;

           System.out.println(f);
           count++;
       }


    }


}