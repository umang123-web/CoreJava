package Chapter23.TheCollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
Program 2 : A program which shows the use of Hashset and Iterator
 */
public class HS {

    public static void main(String[] args) {
        //HashSet<String> set = new HashSet<>();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("America");
        set.add("London");
        set.add("India");
        set.add("Brazil");

        //view the list
        System.out.println("Hash set ="  + set);


       Iterator it = set.iterator();

        System.out.println("Element using Iterator:");

        while(it.hasNext()){
            String s = (String) it.next();

            System.out.println(s);
        }
    }
}
