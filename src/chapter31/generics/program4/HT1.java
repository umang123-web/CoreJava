package chapter31.generics.program4;

import java.util.Hashtable;

/*
* A program to create a Hashtable with cricket players and their scores in the match. Here we do not use generic
*
* */
public class HT1 {

    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("Ajay" , new Integer(40));
        ht.put("Sachin" , new Integer(50));

        String s = "Sachin";
        Integer score =(Integer) ht.get(s);
        System.out.println("score:" + score);

    }
}
