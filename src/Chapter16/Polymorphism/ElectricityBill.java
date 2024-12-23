package Chapter16.Polymorphism;
/*
Program 4: A program to show how to ovveride the calculateBill() method of commerical class inside the domestic class
 */

class Commerical {

    //take the customer name
    private String name;

    public Commerical(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //retrieve the name
    public String getName() {
        return name;


    }

    //to calculate bill taking 5 rps per unit

    void CalculateBill(int unit) {
        System.out.println("Customer:" + getName());

        System.out.println("Bill amount =" + (unit * 5.00));
    }

}

    class Domestic extends Commerical{

        public Domestic(String name) {
            super(name);
        }

        @Override
        void CalculateBill(int unit) {
            System.out.println("The customer name is:"  + getName());
            System.out.println("Bill amount is:"  + (unit * 2.5));
        }
    }

    

public class ElectricityBill {

    public static void main(String[] args) {

        Commerical c = new Commerical("Rajkumar");

        c.CalculateBill(200);

        Domestic d = new Domestic("Umang");

        d.CalculateBill(100);
    }
}
