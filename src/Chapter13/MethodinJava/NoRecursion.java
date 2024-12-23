package Chapter13.MethodinJava;


//Calculate factorial without recursion
public class NoRecursion {

    static long factorial(int num){
        long fact=1;
        while (num >0){
            fact *=num--; //num= num-1;  5-1=4-1=3


        }
        return fact;
    }


    public static void main(String[] args) {
        System.out.println(factorial(5));

    }
}
