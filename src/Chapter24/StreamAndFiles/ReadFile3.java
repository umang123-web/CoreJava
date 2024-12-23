package Chapter24.StreamAndFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Program 8: Program we are reading String by String from a text file using BufferedReader and FileReader streams
 */
public class ReadFile3 {

    public static void main(String[] args) throws IOException {

        String str;

        //connect FileReader to the text file
        FileReader fr = new FileReader("Stringfile");

        //connect FileReader to BufferedReader
        BufferedReader br = new BufferedReader(fr);

        //read String by String from br and display

        while ((str = br.readLine()) !=null){
            System.out.println(str);
        }

        br.close();
    }
}
