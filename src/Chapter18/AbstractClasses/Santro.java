package Chapter18.AbstractClasses;


//Program 5
public class Santro extends Car {


    public Santro(int regino) {
        super(regino);
    }

    @Override
    void steering(int direction, int angle) {
        System.out.println("Take a turn");
        System.out.println("This car uses power steering");
    }

    @Override
    void brakes(int force) {

        System.out.println("Brakes applied");
        System.out.println("This car uses gas brakes");
    }
}
