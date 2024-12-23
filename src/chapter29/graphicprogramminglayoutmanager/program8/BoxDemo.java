package chapter29.graphicprogramminglayoutmanager.program8;

import javax.swing.*;
import java.awt.*;

/*
* A program to create three horizontal boxes with components and finally add them inside another
* vertical boxes
*
*
* */
public class BoxDemo extends JFrame {

    public BoxDemo(){
//        create a label and text field
        JLabel label = new JLabel("Enter Name:");
        JTextField td = new JTextField(20);
        td.setMaximumSize(td.getPreferredSize());

//        create top horizontal box and add above components to it
        Box horzi1 = Box.createHorizontalBox();
        horzi1.add(label);

//        gap 20px
        horzi1.add(Box.createHorizontalStrut(20));

        horzi1.add(td);



//        create a label and text field
        JLabel label1 = new JLabel("Enter password:");
        JTextField td1 = new JTextField(20);
        td1.setMaximumSize(td1.getPreferredSize());

        Box horzi2 = Box.createHorizontalBox();
        horzi2.add(label1);

        horzi2.add(Box.createHorizontalStrut(20));
        horzi2.add(td1);


//        create 2 push button
        JButton b1 = new JButton("Ok");
        JButton b2 = new JButton("Cancel");

//        construct the bottom horizontal box and add component to it

        Box horzi3 = Box.createHorizontalBox();
        horzi3.add(b1);
        horzi3.add(Box.createHorizontalGlue()); //throw button apart
        horzi3.add(b2);

//        add the three horizontal boxes inside a vertical boxes
        Box vert = Box.createVerticalBox();
        vert.add(horzi1);
        vert.add(Box.createVerticalStrut(100));
        vert.add(horzi2);
        vert.add(Box.createVerticalStrut(100));

        vert.add(horzi3);

        Container c = getContentPane();
        c.add(vert);

    }

    public static void main(String[] args) {
        BoxDemo demo = new BoxDemo();
        demo.setSize(400 ,400);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
