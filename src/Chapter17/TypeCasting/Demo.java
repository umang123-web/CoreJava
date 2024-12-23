package Chapter17.TypeCasting;

/*
Program 6: A program where an object is passed to printName() method and the className of the
object is displayed by the method
 */



class App{
    int x;

    public App(int x){
        this.x = x;
    }
}

class knowName{
    static  void printName(Object obj){
        Class c = obj.getClass();
        String name = c.getName();
        System.out.println("The className is:"  + name);
    }
}
public class Demo {

    public static void main(String[] args) {
        App app = new App(10);

        knowName.printName(app);
    }
}
