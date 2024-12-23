package Chapter13.MethodinJava;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
This is the program to generate required number of prime using method
 */
public class Prime {

    static  boolean prime(long num){

        //initally isPrime is true it become false if num is not prime

        boolean isPrime = true;
        //from 2 to num -1 , if any number divides num its is not prime

        for(int i=2; i<=num-1; i++){
            if(num %i ==0) isPrime =false;

        }


      return  isPrime;

    }


    //accept how many prime required into max.

    //c is counter for no. of prime generated

    static  void generate (long max){
        long c=1 , num =2;

        while (c<=max){
            if(prime(num)){   //call prime()
                System.out.println(num);
                ++c;
            }

            ++num;
        }
    }


    public static void main(String[] args) throws IOException {
        //accept the number of prime are needed

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How many primes?  " );
        int max = Integer.parseInt(br.readLine());
        //generate max number of primes
        Prime.generate(max);
    }
}
