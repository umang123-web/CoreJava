package Chapter21.ExceptionHandling;

/*
Program 4: A program that opens the file in the beginning.Then the number of command line argument is accepted
into n. This n is  divides  a number 45  and result is stored and finally the file are closed
 */
public class Ex {

    public static void main(String[] args) {
        System.out.println("Open files");

        int n = args.length;
        System.out.println("n = "  + n);
        int a = 45/2;
        System.out.println("a:"  + a);
        System.out.println("close the files");
    }
}
