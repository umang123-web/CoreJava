package Chapter24.StreamAndFiles;

import java.io.*;

/*
Program 2: A program to improve the efficency of writing data into a file using BufferedOutputStream
 */
public class CreateFile1 {

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);

        FileOutputStream file = new FileOutputStream("myfile.txt" , true);
        //attach fileOutputstream to BufferedOutputStream

        BufferedOutputStream br = new BufferedOutputStream(file , 1024);

        System.out.println("Enter a text (@ at the end):     ");

        char ch;
        while ((ch = (char) dis.read()) !='@'){
            file.write(ch);

        }
        file.close();

    }

}
