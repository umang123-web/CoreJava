package chapter29.graphicprogramminglayoutmanager.program7;

import javax.swing.*;
import java.awt.*;

/*
* A program to understand the usage of boxlayout
*
* */
public class BoxLayoutDemo extends JFrame {


    public BoxLayoutDemo(){
        Container c= getContentPane();
        c.setLayout(new FlowLayout());

//        create a JPanel object which holds components

        MyPanel1 mp1 = new MyPanel1();

//        add the panel in c
        c.add(mp1);

//        create another JPanel object which hold another set of components
        MyPanel2 mp2 = new MyPanel2();

        c.add(mp2);



    }

    public static void main(String[] args) {
        BoxLayoutDemo demo = new BoxLayoutDemo();
        demo.setSize(400 ,400);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}


class MyPanel1 extends JPanel {
//    create BoxLayout object to arrange x-axis

    public MyPanel1() {


        BoxLayout box1 = new BoxLayout(this, BoxLayout.X_AXIS);

//    set box layout to JPanel


        this.setLayout(box1);

//        create 3 push button and add them to panel using box layout
        JButton b1 , b2 , b3;
        b1= new JButton("button1");
        b2 = new JButton("button2");
        b3 = new JButton("button3");

        add(b1);
        add(b2);
        add(b3);
    }



}

class MyPanel2 extends JPanel{

    public MyPanel2() {
        BoxLayout box2 = new BoxLayout(this, BoxLayout.Y_AXIS);

        setLayout(box2);

        JButton b1 , b2 , b3;
        b1 = new JButton("button1");
        b2 = new JButton("button2");
        b3 = new JButton("button3");
        add(b1);
        add(b2);
        add(b3);
    }
    }