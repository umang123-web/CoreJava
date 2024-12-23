package Chapter15.Inheritence;


/*
Program 8: A program to find the areas of square and Rectangle by deriving them from
shape
 */

class Shape{
    protected double i;

    Shape(double i){
        this.i = i;
    }
}


class Square extends Shape{
    Square(double i){
        super(i);
    }


    void area(){
        System.out.println("Area of square:"  + i*i);
    }
}


class Rectangle extends Square{

    double b;

    Rectangle(double a , double b) {
        super(a);
        this.b = b;

    }


    void area(){
        System.out.println("Area of Rectangle:"  + (i*b));
    }


}

public class Inherit {

    public static void main(String[] args) {

        Square square = new Square(5.5);

        square.area();


        Rectangle r = new Rectangle(5.5 , 6);
        r.area();


    }

}
