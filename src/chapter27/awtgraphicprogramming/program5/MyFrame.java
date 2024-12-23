package chapter27.awtgraphicprogramming.program5;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
* A program to close the frame using an anonymous inner class
* */
public class MyFrame extends Frame {

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("Hello AWT");
        f.setBackground(Color.red);
        f.setSize(500 ,400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


}
