package chapter28.swingprogramming.program5;

import javax.swing.*;
import java.awt.*;

/*
* A program to display some text in the frame with the help of label
*
* */
public class FrameDemo extends JFrame {

    JLabel label;

    public FrameDemo(){
//        create content pane

        Container c = this.getContentPane();

//        set the layout manager to c;
        c.setLayout(new FlowLayout());

//        set a background color for content pane c
        c.setBackground(Color.green);

//        create a label with some text

        label = new JLabel("Hello Learners!");

//        set font for label
        label.setFont(new Font("helvertica" , Font.BOLD , 34));

//        set red color
        label.setForeground(Color.red);

    c.add(label);
    }

    public static void main(String[] args) {
        FrameDemo demo = new FrameDemo();


        demo.setSize(400 , 400);
        demo.setVisible(true);
        demo.setTitle("My Swing frame");
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
