package Chapter24.StreamAndFiles;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
program 7: A program to store String into a text file
 */
public class CreateFile3 {

    public static void main(String[] args) throws IOException {
        //to read Strings from keyboard

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        //open file for writing
        FileWriter fw = new FileWriter("Stringfile");
          //read String and store in the file till exit is typed

        System.out.println("Enter Data:  ");
        while (!(str = br.readLine()).equals("exit")){
            fw.write(str + "\n");

        }

        fw.close();
    }
}
