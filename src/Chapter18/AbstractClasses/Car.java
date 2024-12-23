package Chapter18.AbstractClasses;
/*
Program 3: A program in which abstract class car contains an instance variable , one
concrete method and two abstract methods. compile the code to get car.class.
 */
public abstract class Car {

    //every car has a registration

    int regino;

    public Car(int regino){
        this.regino = regino;
    }

    void fueltank(){
        System.out.println("filling the tank");
    }



    //All the cars have the steering but different cars have a different steering

    abstract void steering(int direction , int angle);

    //All the cars have the brakes but different cars have different brakes

    abstract void brakes(int force);

}
