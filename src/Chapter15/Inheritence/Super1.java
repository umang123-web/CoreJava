package Chapter15.Inheritence;


/*
Program 4: A program to access method the super class
and instance variable by using super keyword from sub class.
 */

class Three{
    int x=10;

    void show(){
        System.out.println("the value of i:"  + x);
    }
}


class four extends Three{
    int x =20;

    void show(){
        System.out.println("The value of i:"   + x);



        //call super class method to access super class
        super.show();


        System.out.println("The value of i:"  + super.x);
    }



}


public class Super1 {


    public static void main(String[] args) {
        four four = new four();

        four.show();
    }
}
