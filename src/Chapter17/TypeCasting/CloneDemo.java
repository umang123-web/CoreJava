package Chapter17.TypeCasting;

/*
Program 7: Write a program to make cloning Employee class object by writing our own myClone() method from where Object
class clone() method is called
 */


class Employee implements Cloneable{
    int id;
    String name;

    public Employee(int id , String name){
        this.id=id;
        this.name=name;
    }


    void getData(){
        System.out.println("Id="  + id);
        System.out.println("name=" + name);
    }

    //clone the present class object
    public Object myClone() throws CloneNotSupportedException{  //our own method
        //create clone object and return it
        return super.clone();
    }
}
public class CloneDemo {


    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee(1 , "Umang");
        System.out.println("Original Object:");
        e1.getData();

        Employee e2 = (Employee) e1.myClone();
        System.out.println("Cloned Object");
        e2.getData();
    }
}
