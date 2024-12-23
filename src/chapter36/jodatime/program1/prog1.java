package chapter36.jodatime.program1;

import java.time.LocalDate;
import java.time.LocalTime;

/*
* A program to display system time nand date
* */
public class prog1 {

    public static void main(String[] args) {
//        LocalDate.now() gives system date into LocalDateObj

        LocalDate today = LocalDate.now();

//        LocalTime.now() gives system time into LocalTimeobj

        LocalTime time = LocalTime.now();

        System.out.println(today);
        System.out.println(time);
    }
}
