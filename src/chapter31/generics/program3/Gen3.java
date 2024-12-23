package chapter31.generics.program3;

interface Fruit<T>{
     void tellTaste(T fruit);
}

class AnyFruit<T> implements Fruit<T> {

    @Override
    public void tellTaste(T fruit) {

        String fruitname = fruit.getClass().getName();
//        then decide the taste and apply

        if (fruitname.equalsIgnoreCase("Banana"))
            System.out.println("Banana is sweet");
        else if (fruitname.equals("Grapes"))
            System.out.println("grapes is sour");


    }
}

class Banana{
}
public class Gen3 {
    public static void main(String args[]) {
//        create Banana object and pass it to AnyFruit class
        Banana b = new Banana();
       AnyFruit<Banana> fruit1 = new AnyFruit<>();
       fruit1.tellTaste(b);

    }
}
