package Chapter16.Polymorphism;


//Program 3: A program to use super class reference to call the calculate method()

//static polymorphism method


class Three{
    //method to calculate square value

    static void calculate(double x){
        System.out.println("The value of square of x:"  + (x *x));
    }
}


class Four extends Three{
    static  void calculate(double x){
        System.out.println("The value of square root of x:" +  Math.sqrt(x));
    }
}
public class Polyone {

    public static void main(String[] args) {
        //Four.calculate(25);
        Three t = new Four();

        Three.calculate(25);


    }

}
