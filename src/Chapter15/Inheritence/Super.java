package Chapter15.Inheritence;


//program 3: A program where the names of instance of variables and methods in super and sub classes are same.
//Hence by default only sub class member are accessible

class One{
    int i=10;

    void show(){
        System.out.println("the value of i:"  + i);
    }
}


class Two  extends  One{
    int i=20;

    void show(){
        System.out.println("The value of i: "  + i);
    }
}



public class Super {

    public static void main(String[] args) {
        Two two = new Two();

        //This will call sub class method only

        two.show();
    }


}
