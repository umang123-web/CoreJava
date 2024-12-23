package chapter33.enumerationandannotations.program1;
/*
* A program to declare an enumeration , Days , and retreive all days from it using the values() method
*
* */

enum Days{
    SUNDAY , MONDAY , TUESDAY , WEDNESDAY , THURSDAY , FRIDAY , SATURDAY;
}
public class DisplayEnum {

    public static void main(String[] args) {
//        using values() method retrieve all enum constant into all days[] array

        Days[]days = Days.values();

        for(Days days1 : days){
            System.out.println(days1);
        }
    }
}
