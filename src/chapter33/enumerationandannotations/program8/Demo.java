package chapter33.enumerationandannotations.program8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/*
* A program to create a single - value annotation that stores only one values
* and retrieve it during runtime by the JVM
*
* */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle{

//    this variable name must be value only
    int value();
}

/*
* We will apply MySingle annotation to a method in the following class
* */

class MyClass{
    /*
    * annotate a method using MySingle annotation. store value 100 into MySingle Annotation
    * */
    @MySingle(value =  100)
    public void mymethod(){
        System.out.println("hello");
    }
}
public class Demo {
    public static void main(String[] args) throws NoSuchMethodException {

        MyClass myclass = new MyClass();
//        getClass() method return the method class object
//        getMethod() returns the method class object

        Method m =myclass.getClass().getMethod("mymethod");

//        now retrieve the single annotation associated with the method
        MySingle anno = m.getAnnotation(MySingle.class);

//        retrieve and display the value in the annotation
        System.out.println("value=" + anno.value());
    }
}
