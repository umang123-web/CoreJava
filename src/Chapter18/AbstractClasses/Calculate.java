package Chapter18.AbstractClasses;

abstract  class Plan{
    protected  double rate;

    abstract void getrate();

    void calculatebill(int unit){
        System.out.println("Bill amount is:"+ unit +   "units :");
        System.out.println(unit * rate);
    }
}

class Commerical extends Plan{

    @Override
    void getrate() {
        rate = 5.00;
    }
}

class Domestic extends Plan{

    @Override
    void getrate() {
        rate = 2.60;
    }
}

public class Calculate {

    public static void main(String[] args) {
        Commerical c = new Commerical();
        c.getrate();
        c.calculatebill(400);


        System.out.println("*****************");

        Domestic d = new Domestic();
        d.getrate();
        d.calculatebill(200);
    }
}
