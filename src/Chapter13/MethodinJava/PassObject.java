package Chapter13.MethodinJava;

class Employees{
      int id1;
      int id2;

    public Employees(int id1, int id2) {
        this.id1 = id1;
        this.id2 = id2;
    }



    @Override
    public String toString() {
        return "Employees{" +
                "id1=" + id1 +
                ", id2=" + id2 +
                '}';
    }


}




class Checkes{
    void smap(Employees obj){

        int temp;

           temp = obj.id1;
           obj.id1 = obj.id2;
           obj.id2 = temp;
    }
}

public class PassObject {


    public static void main(String[] args) {

        Employees employees = new Employees(10 , 20);

  System.out.println(employees.id1 + "\t" + employees.id2);

        Checkes checkes = new Checkes();

        checkes.smap(employees);

        System.out.println(employees.id1 + "\t" + employees.id2);
    }


}
