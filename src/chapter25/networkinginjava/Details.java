package chapter25.networkinginjava;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/*
Program 3: A program to display the details and the index.html page content www.yahoo.com
 */
public class Details {

    public static void main(String[] args) throws IOException {
        //pass the site url to Url object
        URL obj = new URL("http://www.yahoo.com/index.html");

        //open a connection with the site on Internet

        URLConnection conn = obj.openConnection();
        //display the date

        System.out.println("Date:" + new Date(conn.getDate()));
        //display the content type whether text or html
        System.out.println("Content-type: " + conn.getContentType());
        //display expiry date
        System.out.println("Expiry: " + conn.getExpiration());
        //display last modified date
        System.out.println("Last modified: " + new Date(conn.getLastModified()));

        //display how many bytes the index.html page has
        int l = conn.getContentLength();
        System.out.println("Length of contents: " + l);

        if(l==0){
            System.out.println("content not available");
            return;
        }else {
            int ch;
            InputStream in = conn.getInputStream();
            //display the content of the index.html page
            while ((ch = in.read()) !=-1){
                System.out.print((char) ch);
            }
        }
    }
}
