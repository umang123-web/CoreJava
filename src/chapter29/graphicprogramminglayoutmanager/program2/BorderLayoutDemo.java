package chapter29.graphicprogramminglayoutmanager.program2;

import javax.swing.*;
import java.awt.*;

/*
* A program to create a group of push button and add them to the container
* by using Border Layout
*
* */
public class BorderLayoutDemo extends JFrame {

    public BorderLayoutDemo(){
        Container c = this.getContentPane();

        BorderLayout border = new BorderLayout(10 , 10);

        c.setLayout(border);

        JButton b1 , b2 , b3 , b4 , b5;

       b1 = new JButton("button1");
       b2= new JButton("button2");
       b3= new JButton("button3");
       b4= new JButton("button4");
       b5 = new JButton("button5");

       c.add("North",b1);
       c.add( "South",b2);
       c.add( "East",b3);
       c.add("West", b4);
       c.add("Center" , b5);


       c.add(b1 , BorderLayout.NORTH);
       c.add(b2 , BorderLayout.SOUTH);
       c.add(b3 , BorderLayout.EAST);
       c.add(b4 , BorderLayout.WEST);
       c.add(b5 , BorderLayout.CENTER);



    }


    public static void main(String[] args) {
        BorderLayoutDemo demo = new BorderLayoutDemo();
        demo.setSize(400 , 400);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
