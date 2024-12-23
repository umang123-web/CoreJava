package Chapter23.TheCollectionFramework;

import java.util.ListIterator;
import java.util.Vector;

/*
program 6: A program that shows the use of vector class
 */
public class VectorDemo {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        //take an int type array

        int x[]= {22 , 20 , 10 , 40 ,15 , 60 };
         //when x[i] is stored into v below. x[i] values are converted into
        //Integer objects and stored into v. this is auto boxing

        for(int i=0; i< x.length; i++){
            v.add(x[i]);

        }


        //retrieve the element using get()
        System.out.println("vector element:  ");
        for(int i=0; i<v.size(); i++){
            System.out.println(v.get(i));
        }


        //retreive  the data from ListIterator

        System.out.println("Element using ListIterator: ");
        ListIterator it = v.listIterator();

        System.out.println("In forward direction");
        while (it.hasNext()){
            System.out.println(it.next() + "\t");
        }


        System.out.println("********************");

        System.out.println("In backward direction");
        while (it.hasPrevious()){
            System.out.println(it.previous() + "\t");
        }


    }

}
