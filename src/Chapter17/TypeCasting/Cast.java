package Chapter17.TypeCasting;
/*
Porgram 1 & 2:Widening in referenced Data Types
Let us observe the difference between widening and narrowing in case of reference data type. In program 1
we take class one as a super class and class. Two as its sub class. we do widening by using super class reference
to refer to sub class object. In this case we convert the sub class object type as super class type and in narrowing
casting we can accesss only super class method not sub class that s' mean we have only 50% functionality

A program to see the widening effect when super class reference is used to refer class object
 */


class One{
    void show1(){
        System.out.println("super class method");
    }
}

class Two extends One{
    @Override
    void show1() {
        System.out.println("sub class method");
    }

}
public class Cast {

    public static void main(String[] args) {
        //o is super class reference
        One o;
        o=(One) new Two(); // o is referring to sub class object

        o.show1();
    }
}
