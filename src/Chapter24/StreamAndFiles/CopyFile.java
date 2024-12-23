package Chapter24.StreamAndFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Program 15: A program to read the contents of the input file and write them into an output
file. The input file needs to be already available
 */
public class CopyFile {


    public static void main(String[] args) throws FileNotFoundException {
         int ch;
         /*
         open args[0] file for reading data
         here we are using try with resource - statement

          */


        try{
            FileInputStream fis = new FileInputStream(args[0]);
            FileOutputStream fin = new FileOutputStream(args[1]);

            while ((ch = fis.read()) !=-1){
                fin.write(ch);
            }

            System.out.println("file copied");
        }catch (IOException e){
            e.printStackTrace();
        }


    }

}
