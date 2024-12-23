package chapter36.jodatime.program5;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/*
* A program to know the numbers of days between your birthday and today
* */
public class Prog5 {

    public static void main(String[] args) {
//        get today s' date
        LocalDate today = LocalDate.now();
//        create LocalDtae object with your birth date
        LocalDate birthday = LocalDate.of(1990 , Month.JANUARY , 1);

//        find the number of days between using Period class between()

        Period p = Period.between(birthday  , today);

        System.out.printf("you are %d years %d months and %d days older." ,

        p.getYears() , p.getMonths() , p.getDays());
    }
}
