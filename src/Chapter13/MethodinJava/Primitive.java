package Chapter13.MethodinJava;



class Employee{
    private int id;

    public Employee(){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                '}';
    }
}


class Check{

//interchangeable
    void smap(Employee obj1 , Employee obj2){


        Employee temp;
        temp = obj1;
        obj1 = obj2;
        obj2 = temp;

    }


}


//pass by value or call by value


public class Primitive {

    public static void main(String[] args) {



        Employee employee = new Employee();
        Employee employee1 = new Employee();




        System.out.println(employee + "\t" + employee1);
        //copy transfer to this
        Check check = new Check();

        check.smap(employee , employee1);

        System.out.println(employee + "\t" + employee1);

    }

}
