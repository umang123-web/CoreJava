package Chapter23.TheCollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

/*
Program 5: A program to create an arraylist with string and perform various operation on it.
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>();

        obj.add("Apple");
        obj.add("Mango");
        obj.add("Grapes");
        obj.add("Guava");

        System.out.println("content:" + obj);

        System.out.println("****************");
        obj.remove(3);
        System.out.println("content:"  + obj);

        System.out.println("size:"  + obj.size());

        Iterator it = obj.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
