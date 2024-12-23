package Chapter18.AbstractClasses;

public class UsedCar {

    public static void main(String[] args) {
        Maruti m = new Maruti(1003101);
        Santro s = new Santro(2334522);

        Car ref;

        ref=m;
        ref.fueltank();
        ref.steering(1 , 90);
        ref.brakes(500);
        m.wings();
        System.out.println("*******************");
        ref =s;

        ref.fueltank();
        ref.steering(1 , 90);
        ref.brakes(600);


    }
}
