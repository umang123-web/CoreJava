package chapter27.awtgraphicprogramming.program12;

import java.awt.*;
/*
* A program to know which fonts are available in a local system
* */
public class Fonts{

    public static void main(String[] args) {
//        get the local graphics environment information into
//        GraphicsEnvironment object ge

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//        From ge , get available font family names into fonts[];
        String font[] = ge.getAvailableFontFamilyNames();

        System.out.println("Available fonts on this system");

//        retrieve one by one the font names from font[] and display

        for(int i=0; i< font.length; i++){
            System.out.println(font[i]);
        }
    }


}
