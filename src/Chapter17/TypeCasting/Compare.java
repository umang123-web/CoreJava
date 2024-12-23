package Chapter17.TypeCasting;
/*
Program 5: A program where equals() method compares myclass object references. The same equas() method is used to
compare Integer class object content
 */
class myclass{
    int x;

    public myclass(int x){
        this.x =x;

    }
}
public class Compare {

    static void print(Object obj){
        Class c =obj.getClass();
        String name = c.getName();
        System.out.println("The className is:" + name) ;
    }

    public static void main(String[] args) {
        //create two myClass  object with same contents
        //In this case , references of object will be differents
        myclass class1 = new myclass(1);
        myclass class2 = new myclass(2);

       //create two wrapper class objects and store same content
        //In this case , references of objects will be different.
        //here in wrapper class compare with same content


        String class3 = new String("hello");
        String class4 = new String("hello");


if(class1.equals(class2)){
    System.out.println("both the integer are same");
}else {
    System.out.println("Both integer are not same");
}



    if(class3.equals(class4)){
        System.out.println("both string are same");
    }else {
        System.out.println("both string are not same");
    }


       Compare compare = new Compare();

       Compare.print(compare);
    }

}


