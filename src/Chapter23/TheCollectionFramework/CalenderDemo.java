package Chapter23.TheCollectionFramework;

import java.util.Calendar;

/*
Program 13: A program that shows the use of  Calender class
 */
public class CalenderDemo {

    public static void main(String[] args) {
        //create calender class object by default it contains the system date and time

        Calendar cl = Calendar.getInstance();

        //display date separately

        System.out.println("Current date: ");
        int dd = cl.get(Calendar.DATE);
        int mm = cl.get(Calendar.MONTH);
        ++mm;
        int yyyy = cl.get(Calendar.YEAR);

        System.out.println(dd + " - " +  mm + " -"  + yyyy  );


        //display time alone

        System.out.println("current time: ");
        int h = cl.get(Calendar.HOUR);
        int m = cl.get(Calendar.MINUTE);
        int s = cl.get(Calendar.SECOND);

        System.out.println(h + ":" + m +  " : " + s);

        int x = cl.get(Calendar.AM_PM);
        if(x ==0){
            System.out.println("Good Morning");
        }else {
            System.out.println("Good Evening");
        }

    }
}
