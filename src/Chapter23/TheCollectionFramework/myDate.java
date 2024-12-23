package Chapter23.TheCollectionFramework;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/*
Program 14 : A program that shows the use of Date class
 */
public class myDate {

    public static void main(String[] args) {
        Date d = new Date();
        //format the date to medium format and time to short format

        DateFormat fmt = DateFormat.getDateTimeInstance(DateFormat.MEDIUM , DateFormat.SHORT  , Locale.US);

        //apply the above format to date object

        String str = fmt.format(d);
        System.out.println(str);
    }
}
