package chapter33.enumerationandannotations.program4;

/*
* A program to create an enumeration with planet names and their distances and mass
* Then retreive all the data and display in tabular form
*
* */

enum Planets{
//    constant in the enumeration each with 2 values planet name , distance and mass

    Mercury(57910 , 3.30e23) , Venus(108200 , 487e24) , Mars(227940 , 6.42e23) , Earth(149600 , 5.98e24);
    private long distance;
    private double mass;

    Planets(long d , double m){
        distance = d;
        mass = m;
    }

    public long getDistance() {
        return distance;
    }

    public double getMass() {
        return mass;
    }
}

public class DisplayEnum1 {
    public static void main(String[] args) {
//        this is for heading
        System.out.println("PLANET" + "\t\t" + "DISTANCE(km)" + "\t" + "MASS(kg)");


//        display all constant names and values
        for(Planets p : Planets.values() ){
            System.out.print(p + "\t\t");
            System.out.print(p.getDistance() + "\t\t");
            System.out.print(p.getMass() + "\n");
        }
    }
}
