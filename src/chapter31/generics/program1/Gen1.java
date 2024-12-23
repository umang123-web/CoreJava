package chapter31.generics.program1;
/*
* A program to create a class myClass store an object of any data type in this class
* */
//here T is generic parameter which determines the datatype

class Myclass<T>{

    T obj;
    public Myclass(T obj ){
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}

public class Gen1 {
    public static void main(String[] args) {

        Integer i =12;
//        create myclass object and store integer object in it
//        Integer i = new Integer(12);  this is done by compiler itself and this is called autoboxing

        Myclass<Integer>obj = new Myclass<>(i);
        System.out.println("you got:" + obj.getObj());

        Float f1 =12.33f;
        Myclass<Float>obj1 = new Myclass<>(f1);
        System.out.println("you got:" + obj1.getObj());
        String name="Umang Ohri";
        Myclass<String>fname = new Myclass<>(name);
        System.out.println("your name is:" + fname.getObj());

    }
}
