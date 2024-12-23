package chapter36.jodatime.program4;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
* A program to know the current time zone and find the date and time at the current location and
* at Los Angeles USA
*
* */
public class Prog4 {
    public static void main(String[] args) {
        /*
        * ZoneId and ZoneDateTime classes
        * To know the time Zone of our country
        *  * */

//        get the default timeZone. If the program is executed in India, then the default
//        time zone represent India

        ZoneId zone = ZoneId.systemDefault();
        System.out.printf("%nCurrenttimeZone= %s" , zone);

//        get the zone identification for Los Angeles

ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zt = ZonedDateTime.now(la);

        System.out.printf("%n Date and Time in Los Angeles: %s" , zt);
    }
}
