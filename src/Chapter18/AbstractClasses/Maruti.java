package Chapter18.AbstractClasses;
//Program 4
public class Maruti extends Car {
    public Maruti(int regino) {
        super(regino);
    }

    @Override
    void steering(int direction, int angle) {
        System.out.println("make a turn");
        System.out.println("This is ordinary  steering");

    }

    @Override
    void brakes(int force) {

        System.out.println("Brakes applied");
        System.out.println("These are hydraulic brakes");
    }

    void wings(){
        System.out.println("maruti has good wings");
    }
}
