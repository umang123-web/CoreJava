package chapter33.enumerationandannotations.program2;

/*
* A program to create an enumeration with color names and then display the name of a particular
* color depending on a specific color
*
* */

enum Color{
    RED , YELLOW , GREEN  , BLUE , PINK ;
}
public class ColorTest {

    Color c;

    public ColorTest(Color c){
        this.c = c;
    }

    void display(){
        switch (c){
            case RED -> System.out.println("Red colour");
            case GREEN -> System.out.println("Green color");
            case PINK -> System.out.println("yellow color");
            case BLUE -> System.out.println("blue color");
        }
    }

    public static void main(String[] args) {
        ColorTest test = new ColorTest(Color.GREEN);
        test.display();
    }
}
