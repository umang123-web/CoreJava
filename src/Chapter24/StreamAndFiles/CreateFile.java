package Chapter24.StreamAndFiles;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Program 1: Creating a file using FileOutputStream
 */
public class CreateFile {

    public static void main(String[] args) throws IOException {
        //attach keyboard to DataInputStream

        DataInputStream dis = new DataInputStream(System.in);

        //attach my file to fileOutputStream

        //If we run again then we lost data and fresh will read and write and if we don't want to lost
        //the data then we have to append it by writing myfile.txt , true

        FileOutputStream fout = new FileOutputStream("file.txt" , true);

        System.out.println("Enter Text (@ at the end):   ");

        char ch;

        //read characters from dis into ch. Then write them into the fout.
        //repeat this as long as the read character is not @

        while ((ch = (char) dis.read()) !='@'){

            fout.write(ch);
        }

        //close the file
        fout.close();
    }

}
