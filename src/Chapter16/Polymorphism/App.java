package Chapter16.Polymorphism;

//Program : 1
class Sample{

    //A method which has same name but different method signature within the same class are called method Overloading.
    void add(int a , int b){
        System.out.println("The value of add two number is:"  + (a +b));
    }

    void add(int a , int b , int c){
        System.out.println("The value of add three number is:"  + (a +b + c));
    }
}
public class App {

    public static void main(String[] args) {
        Sample s = new Sample();
        s.add(10 , 25);
        s.add(10 , 25 , 15);
    }
}
