package Chapter13.MethodinJava;


class Employ{


}


public class Hello {

Class c = Class.forName("Chapter13.MethodinJava.Employee");

    public Hello() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
    }
    
    
    //cloning one obj to create another object
    
    Employee obj = (Employee) c.newInstance();
    

    
    Employ obj1 = new Employ();

}
