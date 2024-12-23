package chapter25.networkinginjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
Program 1: A program to accept a website name and return its Ip address after checking it on internet
 */
public class Address {

    public static void main(String[] args) throws IOException {
        //accept name of website from keyboard

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a website name: ");
        String site = br.readLine();

        try{
            //getByName() method accepts site name and it Ipaddress

            InetAddress ip = InetAddress.getByName(site);
            System.out.println("The IP address is:"  + ip);


        }catch (UnknownHostException ue){
            System.out.println("website not found");
        }

    }
}
