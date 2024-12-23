package Chapter24.StreamAndFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
Program 14: A program which accept a filename from command line argument and display
the number of character words and lines in the file
 */
public class Count {

    public static void main(String[] args) throws IOException {
        int ch;
        boolean prev = true;
        int char_count =0;
        int word_count =0;
        int line_count=0;
        //attach the file arg[0] to fileinputstream to read data

        FileInputStream file = new FileInputStream(args[0]);

        //read character from the file till end

        while ((ch = file.read()) !=-1){
            if(!prev && ch == ' ') ++word_count;
            //don't count if prev char is space

            if(ch == ' ') prev=true; else prev = false;

            if(ch == '\n') ++line_count;
        }

        //display the count of characters , words and lines

        char_count -= line_count*2;
        word_count +=line_count;

        System.out.println("No of chars=" + char_count);
        System.out.println("No of word ="  + word_count);
        System.out.println("no of line =" + line_count);
    }
}
