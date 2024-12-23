package Chapter17.TypeCasting;
/*
The solution for these problems is. Let us not create an object to super class. As we did in a previous case.
This time we create an object to sub class and use narrowing , as shown in program 4:

Program 4:A program for creating super class reference to refer to sub class object
 */

class Five{
    void show(){
        System.out.println("super class method");
    }
}

class Six extends Five{
    void show1(){
        System.out.println("sub class method");
    }
}
public class Cast2 {

    public static void main(String[] args) {
        Five f;
        f= new Six();//super class referencing to refer to sub class object
        Six s = (Six) new Six();  //this is narrowing -convert class one reference
        s.show();
        s.show1();

    }


}
