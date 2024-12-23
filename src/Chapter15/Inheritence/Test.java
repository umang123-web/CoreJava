package Chapter15.Inheritence;


/*
Program 8: A program to understand the private members are not accessible in subclass
 */


class A{
    protected  int x;
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class B extends A{

    void show(){
        System.out.println("The value of x :"  + super.x);


        //This cannot be accessible due to private access
        System.out.println("The value of z:" +super.getY());
    }
}
public class Test {

    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
