package Chapter13.MethodinJava;


import java.text.NumberFormat;

/*
Factory method example

A program for calculating and displaying area of a circle

 */






public class    Circle {

    public static void main(String[] args) {

       /*
        final double PI=(double) 22/7; //constant
        double r=15.5; //radius
        double area = PI*r*r;

    System.out.println("Area =" + area);


        */


        final double PI = (double) 22 / 7;
        double r = 15.5;
        double area = PI * r * r;
        System.out.println("the area of circle is:" + area);

        //Create a NumberFormat class Object. This is used for formatting the numbers and its belongs to Java.text package

        //This is used for formatting the fraction and integer that how much we want the digit


        /*
        getNumberInstance() is a factory method because factory method is a static method and its belong to class and return
        an object to Number format class.

        Factory method is the another way to creating an object

         */

        NumberFormat obj = NumberFormat.getNumberInstance();
        //store the format information into obj
        obj.setMaximumFractionDigits(2);
        obj.setMinimumFractionDigits(7);

        //apply the format to area value

        String str = obj.format(area);
        //display the formatted area value

        System.out.println("After formatted: " + str);

    }


    }





