package Chapter24.StreamAndFiles;


import java.io.*;

/*
Program 4 : A program which is used to read data from any text file
 */
public class ReadFile1 {

    public static void main(String[] args) throws IOException {

        //to accept filename from keyboard

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter file name:  ");
        String fname = br.readLine();

        //attach the file to FileInputStream

        FileInputStream fin = null; //assign to nothing to fin

        //check if file exist or not

        try{
            fin = new FileInputStream(fname);
        }catch (FileNotFoundException e){
            System.out.println("file not found");
            return;
        }


        //attach FileInputStream to BufferedInputtream
        BufferedInputStream bi = new BufferedInputStream(fin);

        System.out.println("File content: ");

        //read characters from BufferedInputStream and write them
        //to monitor. Repeat this till end of the file

        int ch;

        while ((ch = bi.read()) !=-1){
            System.out.print((char) ch);

        }
        bi.close();

    }
}
