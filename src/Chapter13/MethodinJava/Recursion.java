package Chapter13.MethodinJava;
//factorial calculated by recursion and recursion means a method call by itself
public class Recursion {

    static long factorial(int num){
        long result;

        if(num ==1)
            return 1;

            result = factorial(num-1)*num;

            return result;

    }

    public static void main(String[] args) {
        System.out.println("factorial of 5 is: ");
        System.out.println(Recursion.factorial(5));
    }
}
