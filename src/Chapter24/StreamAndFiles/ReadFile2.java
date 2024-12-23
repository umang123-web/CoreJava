package Chapter24.StreamAndFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
Program 6: A program to show how to read data from the text file using FileReader
 */
public class ReadFile2 {

    public static void main(String[] args) throws IOException {
        int ch;

        //check if the file exist or not


        FileReader file = null;
        //check if file exist or not

        try {
            file = new FileReader("myfile.txt");
        }catch (FileNotFoundException e){
            System.out.println("file not found");
            return;
        }

        while ((ch = file.read()) !=-1){
            System.out.print((char) ch);
        }
        file.close();

    }

}