package Chapter24.StreamAndFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

/*
Program 9: A program to compress the data contained in a file using DeflaterOutputStream.
 */
public class Zip {

        public static void main(String[] args) throws IOException {

        //attach the original file: file1 to
        FileInputStream fr = new FileInputStream("file.txt");

        //attach compress file: file2 to FileOutputStream

        FileOutputStream fw = new FileOutputStream("file2");

        //attach FileOutputStream to DeflatorOutputStream

        DeflaterOutputStream dos = new DeflaterOutputStream(fw);

        //read data from FileInputStream and write it into DeflatorOutputStream
        int data;
        while ((data = fr.read()) !=-1){
            dos.write(data);
        }

        fr.close();
        dos.close();
    }
}
