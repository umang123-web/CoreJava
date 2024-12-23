package chapter27.awtgraphicprogramming.program4;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
* Program 4: A program to close the frame using WindowAdapter class
* */
public class MyFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("Hello AWT");
        frame.setSize(500 , 500);
        frame.setBackground(Color.BLUE);
        frame.setVisible(true);
        frame.addWindowListener(new WindowClass());
    }



}

class WindowClass extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}