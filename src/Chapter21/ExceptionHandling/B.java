package Chapter21.ExceptionHandling;

/*
Program 12: A program to throw the StringIndexOutOfBoundException

 */

class A{
    void method(){
        try {

            //Take a String with 5 chars. Their index will be from 0 to 4
            String name ="hello";

            //Exception is thrown in below statement because there is no index with value 5.
            char ch = name.charAt(5);

        }catch (StringIndexOutOfBoundsException sie){

            System.out.println("Please see the index is within the range");
            throw sie;  //rethrow method
        }
    }
}
public class B {

    public static void main(String[] args) {

        A a = new A();

        try {
            a.method();
            //the rethrowm exception is caught by the below catch clause
        }catch (StringIndexOutOfBoundsException sie){
            System.out.println("I caught rethrown exception");
        }

    }
}
