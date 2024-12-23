package Chapter24.StreamAndFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
Program 5: A program to create a text file using FileWriter
 */
public class CreateFile2 {

    public static void main(String[] args) throws IOException {
        //take a String

        String str = "This is a book on java." + "\n I am a learner of java.";

        //attach file to fileWriter
        FileWriter fw = new FileWriter("myfile.txt");


        BufferedWriter bw = new BufferedWriter(fw);
        //read character wise from String and write into FileWriter

        for(int i=0; i <str.length(); i++ ){

            //fw.write
            bw.write(str.charAt(i));
        }

        bw.close();
    }

}
