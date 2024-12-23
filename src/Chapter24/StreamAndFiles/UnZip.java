package Chapter24.StreamAndFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

/*
Program 10:
 */
public class UnZip {

    public static void main(String[] args) throws IOException {
        //attach input file: file2 to fileInputStream for reading data

        FileInputStream fis = new FileInputStream("file2");

        //attach Output file: file3 to fileOutputStream for writing data

        FileOutputStream fos = new FileOutputStream("file3");

        InflaterInputStream iis = new InflaterInputStream(fis);

        //read data from InflaterInputStream and write it into

        int data;
        while ((data = fis.read())!=-1){
            fos.write(data);



        }
        fos.close();
        iis.close();

    }
}
