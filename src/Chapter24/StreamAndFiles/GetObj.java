package Chapter24.StreamAndFiles;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
Program 13: A program showing de-serialization of objects
 */
public class GetObj {
    public static void main(String[] args) throws IOException {
        //connect FileInputStream to objfile.txt
        FileInputStream file = new FileInputStream("objfile.txt");


        ObjectInputStream obj = new ObjectInputStream(file);

        //read object from obj and store data into Employee object
        try {
            Employee e;
            while ((e = (Employee) obj.readObject())!=null){
                e.displayData();

            }
        } catch (ClassNotFoundException e) {
            System.out.println("End of file  reached");
        }
        finally {
         obj.close();
        }

    }

}
