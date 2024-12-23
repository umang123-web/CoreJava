package Chapter22.WrapperClasses;
/*
Program 3: A program to accept an integer number from keyboard and convert it into other number systems
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Convert {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Integer value");
        String str =br.readLine();

        //convert String into int
        int i = Integer.parseInt(str);

        //convert int into other systems
        str = Integer.toBinaryString(i);
        System.out.println("In binary:"  + str);

        str = Integer.toHexString(i);
        System.out.println("In hexadecimal :" + str );

        str = Integer.toOctalString(i);
        System.out.println("octal:"  + str);

    }
}
