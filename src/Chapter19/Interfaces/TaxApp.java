package Chapter19.Interfaces;
/*
Program 4: A program to understand how to achieve callback mechanism  through interfaces in java
 */

interface Tax{
    double stateTax();
}


class Ap implements Tax{

    @Override
    public double stateTax() {
        System.out.println("According to Ap govt rule");
        return 5000.50;
    }
}


class Karnataka implements Tax{

    @Override
    public double stateTax() {
        System.out.println("According to karnatka govt rules");
        return 2000.00;
    }
}
public class TaxApp {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class c = Class.forName(args[0]);
        //Tax interface is referencing that new object
        Tax ref =(Tax) c.newInstance();

        //call the method to calculate the tax
        calculatetax(ref);

    }

    private static void calculatetax(Tax ref) {
        double ct = 1000.00;
        double st = ref.stateTax();
        System.out.println("Total tax="  + (ct + st));
    }

}
