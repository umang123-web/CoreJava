package chapter34.lambdaexpression.program20;
/*
* A program to understand how to use double colon operator as a reference to the constructor of a
* class
* */
public class Sample {

    private String x;

    Sample(String x){
        this.x =x;
        System.out.println("constructor executed " + x);
    }

//    functional Interface with get() method that return Sample class object

    interface  myInter{
        Sample get(String str);
    }

    public static void main(String[] args) {

//        lambda expression return sample class object
        myInter mi = (String x)->{return  new Sample(x);};

        Sample s = mi.get("from lambda expression");
//        double colon operator refer to sample class Constructor

        myInter mil = Sample::new;
        Sample s1 = mil.get("from double colon operator");
    }
}
