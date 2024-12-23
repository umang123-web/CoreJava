package chapter36.jodatime.program3;

import java.awt.*;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/*
* A program to create LocalDateTime class  object and extract some data from that
* object using method
* */
public class Prog3 {

    public static void main(String[] args) {
//        get the current date and time
        LocalDateTime dt = LocalDateTime.now();
        System.out.printf("%nLocalDatetimeobject with current date and time:%n%s" , dt);

//        create LocalDateTimeObject with date: 1994-4-15 and time 11.30 am
        LocalDateTime dm = LocalDateTime.of(1994 , Month.APRIL , 15 , 11 , 30);
        System.out.printf("%nLocalDateTime object with some date and time: %n%s:" , dm);


//        find out the date and time from 6 month now
        System.out.printf("%n%s" , dt.plusMonths(6));


//        get the day of week for the current date and time

        DayOfWeek dw = dt.getDayOfWeek();

//        represent days of week with its name
        String name = dw.name();
        System.out.printf("%nDay of week name %n%s:" ,  name);

        int n = dw.getValue();
        System.out.printf("%n Day of week value:" , n);
    }
}
