package Chapter19.Interfaces;

/*
Program 3: A program to illustrate how to achieve multiple inheritence using multiple interfaces
 */

interface Father{
    float HT = 6.2F;
    void height();


}

interface  Mother{
    float HT = 5.8f;
    void height();
}


class Child implements Father , Mother{

    @Override
    public void height() {
        float HT = (Father.HT + Mother.HT)/2;
        System.out.println("average height of child is:"  + HT);
    }
}
public class Multi {

    public static void main(String[] args) {
        Child child = new Child();
        child.height();
    }
}
