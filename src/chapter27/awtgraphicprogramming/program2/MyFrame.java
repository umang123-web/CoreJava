package chapter27.awtgraphicprogramming.program2;

import java.awt.*;

/*
* Program 2: A program to create a frame by creating an object to the subclass of frame class
*
* */
public class MyFrame extends Frame {

    public MyFrame(String str){
        super(str);
    }

    public static void main(String[] args) {
        MyFrame f = new MyFrame("Hello AWT");
        f.setSize(400 , 400);
        f.setBackground(Color.cyan);
        f.setVisible(true);
    }
}
