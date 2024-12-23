package chapter33.enumerationandannotations.program9;
/*
* A program to create a multi value annotation that stores only 3 values
* one integer number and two Strings. The annotation can also be retrieved during runtime by JVM
*
* */

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Multi{
    int value();
    String value1();
    String value2();
}
/*
* annotate a class using MyMulti annotation. stores value into MyMulti annotation*/

@Multi(value = 10 , value1 = "Srinu" , value2 = "Hyderabad")
class Myclass{
    void myMethod(){
        System.out.println("hello");
    }
}

/*
access the Multi annotation value using another program
* */

public class Demo {

    public static void main(String[] args) throws ClassNotFoundException {
        Class obj = Class.forName("chapter33.enumerationandannotations.program9.Myclass");

//        now retrieve all annotations associated with the class into Annotation[] array

        Annotation[] annot = obj.getAnnotations();

//        use for each loop to repaet with each annotation

        for(Annotation x : annot){
            /*
            * if the specific annotation (x) belongs to Multi object then store it into Multi object
            * */

            Multi a = (Multi) x;
            if(x instanceof Multi){
//                retrieve the values associated with that Multi object
                System.out.println("value1 =" + a.value());
                System.out.println("value2 =" + a.value1());
                System.out.println("value3 =" + a.value2());
            }
        }
    }
}
