package chapter28.swingprogramming.program2;


import javax.swing.*;
import java.awt.*;

/*
 * program  1 ,2 , 3
 *
 * */
public class MyframeDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        Container c = frame.getContentPane();

        frame.setSize(400 , 400);
        frame.setVisible(true);
        c.setBackground(Color.green);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
