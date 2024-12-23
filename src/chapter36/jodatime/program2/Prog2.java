package chapter36.jodatime.program2;

import java.time.LocalDate;
import java.time.LocalTime;

/*
* A program to retrieve the date and time in parts separately
*
* */
public class Prog2 {

    public static void main(String[] args) {
//        current date is returned by LocalDate.now()


        LocalDate date = LocalDate.now();
//        get the month and year from date
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yy =date.getYear();
        System.out.printf("\n%d-%d" , dd , mm , yy);

//        current time is given by LocalTime.now()

        LocalTime time = LocalTime.now();

//        get hour , minute ,second  and nano second from time

        int h =time.getHour();
        int m =time.getMinute();
        int s = time.getSecond();
        int n = time.getNano();

        System.out.printf("\n%d:%d:%d" , h , m , s , n);
    }
}
