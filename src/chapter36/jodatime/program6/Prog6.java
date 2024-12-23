package chapter36.jodatime.program6;

import java.time.Year;

/*
* A program to test whether a given year us leap or not
* */
public class Prog6 {

    public static void main(String[] args) {
        int n = 2015;

//        create Year class object with that year

        Year y = Year.of(n);

//        test if y is leap or not using isLeap()

        boolean flag = y.isLeap();

        if(flag){
            System.out.printf("%nYear %d is Leap" , n);
        }else {
            System.out.printf("%n Year  %d is not leap." , n);
        }
    }
}
