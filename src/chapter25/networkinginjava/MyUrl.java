package chapter25.networkinginjava;

import java.net.MalformedURLException;
import java.net.URL;

/*
program 2: A program to retrieve different parts of a Url supplied to Url class Objects
 */
public class MyUrl {

    public static void main(String[] args) throws MalformedURLException {


        URL obj = new URL("http://dreamtechpress.com/index.html");
        System.out.println("Protcol:" + obj.getProtocol());
        System.out.println("Host:"  + obj.getHost());
        System.out.println("File: " + obj.getFile());
        System.out.println("port:"  + obj.getPort());
        System.out.println("path:" + obj.getPath());

        System.out.println("External form:" + obj.toExternalForm());
    }
}
