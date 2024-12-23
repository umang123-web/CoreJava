package Chapter22.WrapperClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Program 2: A program which show the use of Byte class objects
 */
public class ByteDemo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a byte no: ");
        String s1 = br.readLine();

        //create Byte object b1 using s1
        Byte b1 = new Byte(s1);

        //accept another byte number as String s2
        System.out.println("Enter a byte number: ");
        String s2 = br.readLine();

        Byte b2 = new Byte(s2);

        //compare both the byte object content
        int n = b1.compareTo(b2);


        if(n==0){
            System.out.println("Both are same");
        }else if(n<0){
            System.out.println(b1 + "is less");
        }else{
            System.out.println(b2 + "is less");
        }
    }

}
