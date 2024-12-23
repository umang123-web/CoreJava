package chapter29.graphicprogramminglayoutmanager.program5;

import javax.swing.*;
import java.awt.*;

/*
* A program to create a five push buttons and add them to the content pane
* using border layout Manager
*
* */
public class GridLayoutDemo extends JFrame {

    public GridLayoutDemo(){
//        create a container
        Container c = this.getContentPane();
//        create grid layout with 2 rows , 3 cols and 50px

//        gap between components
        GridLayout grid = new GridLayout(2 , 3 , 50 , 50);
        c.setLayout(grid);

//        create 5 push button
        JButton b1 = new JButton("Button1");
        JButton b2 = new JButton("button2");
        JButton b3 = new JButton("button3");
        JButton b4 = new JButton("button4");
        JButton b5 = new JButton("button5");

//        add button to c
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
    }

    public static void main(String[] args) {
        GridLayoutDemo grid = new GridLayoutDemo();
        grid.setSize(500 , 500);
        grid.setVisible(true);
        grid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
