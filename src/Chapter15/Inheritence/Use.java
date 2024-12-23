package Chapter15.Inheritence;



//program 1: Create an object to student class and program 2


class Teacher{
    int id;
    String name;
    String address;
    float sal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }
}




class Student extends Teacher{

    int id;
    String name;
    String address;
    int marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
public class Use {


    public static void main(String[] args) {
        Student student = new Student();

        student.setId(1001);
        student.setName("Chaand");
        student.setAddress("Hyderabad");
        student.setMarks(50);


        System.out.println("The student details is:" + "id:" + student.getId()  + "\n"  + "Name:" + student.getName()

        + "\n"  +"Address:"+ student.getAddress()   + "\n"  +"Marks:"+ student.getMarks());


    }


}
