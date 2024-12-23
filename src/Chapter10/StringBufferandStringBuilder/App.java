package Chapter10.StringBufferandStringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuffer sb = new StringBuffer();

        System.out.println("Please enter your surname?");

        String sr = br.readLine();

         //accept middleName;

        System.out.println("Please enter your middleName");

        String mid = br.readLine();

        System.out.println("please enter your lastName");

        String last = br.readLine();

        sb.append(sr);
        sb.append(mid);
        sb.append(last);

        System.out.println("Your surname is:" + sr);
        System.out.println("Your midName is:" + mid);
        System.out.println("Your lastName is:" + last);

          System.out.println("Your fullname is:" + sr + mid + last);
          System.out.println("reverse the name is:" + sb.reverse());



    }
}
