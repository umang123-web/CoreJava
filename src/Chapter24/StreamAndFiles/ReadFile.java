package Chapter24.StreamAndFiles;

import java.io.FileInputStream;
import java.io.IOException;

/*
Program 3: A program to read data from myfile.txt using FileInputStream and display it into the moniotr
 */
public class ReadFile {

    public static void main(String[] args) throws IOException {

        //attach the file to File
        FileInputStream file = new FileInputStream("myfile.txt");


        System.out.println("File contents :");

        //read characters from FileInputStream and write them
        //to monitor. Repeat this till the end of the file
        int ch;
        while ((ch = file.read())!= -1){
            System.out.print((char) ch);

        }
        file.close();
    }
}
