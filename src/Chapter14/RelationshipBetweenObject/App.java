package Chapter14.RelationshipBetweenObject;


//relationship between objects


class One{
    Two obj1;

    One(Two obj1){
        this.obj1 = obj1;
    }
    double cube(double x){
        double result = x* obj1.square(x);

        return  result;
    }

}


class Two{
   Two(Three obj){
       this.obj = obj;
   }
    Three obj;

    double square(double x){
        double result = x*obj.getx(x);

        return result;
    }
}


class Three{

    double getx(double x){
        return x;
    }
}



public class App {

    public static void main(String[] args) {

        //create Three obj1
        Three obj1 = new Three();

        Two obj = new Two(obj1);

        One one = new One(obj);

        double result = obj.square(6);
        double result1 = one.cube(5);

        System.out.println("cube of 5 is:"   + result1);
        System.out.println(" square of 6 is:"  + result);


    }
}
