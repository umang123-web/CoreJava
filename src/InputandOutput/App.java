package InputandOutput;

import javax.annotation.processing.SupportedSourceVersion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class App{

    public static void main(String[] args) throws IOException {




        /*

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your employee id");

        Integer id = Integer.parseInt(br.readLine());

        System.out.println("enter Your sex: M/F");
        char sex =(char)br.read(); //this method will only take one character and reject the another character

        System.out.println("Enter your name");

        String name=br.readLine();
        System.out.println("Your employee id is:" + id);
        System.out.println("You are :" + sex);
        System.out.print("And Your name is:" + name);

         br.close();

*/


        /*

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your employee id");

        Integer id = Integer.parseInt(br.readLine());

        System.out.println("enter your sex: M/F" );

        //char sex = (char)br.readLine().charAt(0);  //solution 1 This is for not skipping the name part

        char sex = (char)br.read();
        br.skip(1);  //solution 2 This is for not skipping the name part
        System.out.println("enter your name");
        String name = br.readLine();

        System.out.println("your employee id" + id);
        System.out.println("You are:" + sex);
        System.out.println("Your name is:" + name);

*/



        //we can achieve the data on same line with the help of StringTokenizer class

        //To accept data from keyboard then we use BufferedReader classs

/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name , age , salary");

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str , ",");

        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();

       s1=  s1.trim();
        s2=s2.trim();
        s3=s3.trim();

        String name = s1;
        int age = Integer.parseInt(s2);
        int salary = Integer.parseInt(s3);


        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("salary:" + salary);

 */


        /*

        BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter two numbers:");

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str , ",");

        String n1 = st.nextToken();
        String n2 = st.nextToken();

        n1 = n1.trim();
        n2 = n2.trim();

        float number1 = Float.parseFloat(n1);
         Double number2 = Double.parseDouble(n2);

         System.out.println("result of addition =" +  (number1 + number2));
         System.out.println("result of subtraction:" + (number1 - number2));
         System.out.println("result of Multiply =" +  (number1 * number2));
         System.out.println("result of divide =" + (number1 / number2));

*/




        /*

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a year");

        int year = Integer.parseInt(br.readLine());


        if(year % 100==0 && year % 400 ==0){
            System.out.println("it is a leap");
        }else if(year % 100 !=0 && year % 4==0){
            System.out.println("it is a leap");
        }else{
            System.out.println("it is not a leap");
        }



         */


        //to get Fibonacci number these are generated by adding two number in sequence


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("How many Fibonacci numbers");

        int n = Integer.parseInt(br.readLine());

        long f1 =0;
        long f2 =1;

        System.out.println(f1);
        System.out.println(f2);

        long f = f1 +f2;
        System.out.println(f);

        int count =3;
        while(count < n){
            f1 = f2;
            f2 =f;
            f = f1 + f2;

            System.out.println(f);
            count++;
        }
        }

    }



