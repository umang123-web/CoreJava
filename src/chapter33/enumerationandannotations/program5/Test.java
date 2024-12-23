package chapter33.enumerationandannotations.program5;
/*
* A program to use the @Override annotation to check whether the sub classes method really overrides the superclass
* or not
*
* */

class One{
    void dosomething(){
        System.out.println("one");
    }
}
class Two extends One{
    @Override
    void dosomething() {
        System.out.println("two");
    }
}
public class Test {

    public static void main(String[] args) {

        Two t = new Two();
        t.dosomething();
    }
}
