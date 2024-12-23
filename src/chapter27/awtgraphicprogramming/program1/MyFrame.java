package chapter27.awtgraphicprogramming.program1;

import java.awt.*;

/*
* Program 1: A program to create a frame by creating an object to frame class
* */
public class MyFrame {
    public static void main(String[] args) {

//        Create a frame
        Frame frame = new Frame("My AWT class");
//       set the size of the frame
        frame.setSize(300 , 250);
//        display the frame
        frame.setVisible(true);

    }
}
