package Chapter24.StreamAndFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Program 17: A program to accept a directory name and display its contents into an array
 */
public class Contents {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter dirpath: ");
        String dirpath = br.readLine();

        System.out.println("Enter dirName: ");
        String dirname = br.readLine();

        //create a file Object with dirpath and dname

        File f = new File(dirpath , dirname);

        if(f.exists()){
            //now arr[i] represents either a file or sub directory

            String arr[ ] = f.list();

            //find no. of entries in the directory
            int n = arr.length;
            //display the entries

            for(int i=0; i<n; i++){

                System.out.println(arr[i]);
                //create File object with the entry and test
                //if it is a file directory

                File f1 = new File(arr[i]);
                if(f1.isFile()) System.out.println(":  is a file");
                if(f1.isDirectory()) System.out.println(":  is a directory");
            }

            System.out.println("No of entries in this directory:" + n);


        }else {
            System.out.println("Directory does not exist");
        }

    }
}
