package chapter31.generics.program5;

import java.util.Hashtable;

public class H1 {

    public static void main(String[] args) {
        Hashtable<String , Integer> ht = new Hashtable<>();
        ht.put("Sachin" , 50);
        ht.put("Dhoni" , 20);
        ht.put("Virat" , 3);

        String d = "Dhoni";

        Integer score = ht.get(d);
        System.out.println("score:" + score);
    }
}
