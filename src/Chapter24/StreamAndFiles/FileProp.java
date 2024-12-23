package Chapter24.StreamAndFiles;

import java.io.File;

public class FileProp {

    public static void main(String[] args) {
        //accept file name or directory name through command line argument

        String fname = args[0];
        //pass the filename or directory name to file object

        File f = new File(fname);
        System.out.println("File name:" + f.getName());
        System.out.println("path:"  + f.getPath());
        System.out.println("Absolute path:"  + f.getAbsolutePath());
        System.out.println("parent:"  + f.getParent());
        System.out.println("Exists:"  + f.exists());


        if(f.exists()){
            System.out.println("writable:"  + f.canWrite());
            System.out.println("read:" +  f.canRead());
            System.out.println("Is a directory:"  + f.isDirectory());
            System.out.println("File size in directory:" + f.length());

        }

    }
}
