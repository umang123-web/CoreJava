package chapter29.graphicprogramminglayoutmanager.program1;

import javax.swing.*;
import java.awt.*;

/*
* A program to create a group of push buttons and arrange them in the container using flow
* Layout manager. The button are right justified
*
* */
public class FlowLayoutDemo extends JFrame {

    public FlowLayoutDemo(){
        Container c = this.getContentPane();
//        create Flowlayout object with alignment : right
//        and 10 px horizontal and vertical

        FlowLayout obj = new FlowLayout(FlowLayout.RIGHT , 10 , 10);
        c.setLayout(obj);

//        create 4 push button
        JButton b1 , b2 , b3 , b4;
        b1 = new JButton("Button1");
        b2= new JButton("Button2");
        b3 = new JButton("button3");
        b4 = new JButton("button4");

//        when we add the button to c , they are added as per flow layout

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);


    }

    public static void main(String[] args) {
        FlowLayoutDemo demo = new FlowLayoutDemo();
        demo.setSize(400 , 400);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
