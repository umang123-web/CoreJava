package chapter28.swingprogramming.program12;

import javax.swing.*;
import java.awt.*;

/*
* A program to create a tabbed pane with two tab sheet. In the first tab sheet. we display
* some push button with names of capital cities. In the second tab sheet we display
* some checkboxes with names of countries
*
* */

class CapitalPane extends JPanel{


    public CapitalPane(){
        JButton b1 = new JButton("Washington");
        JButton b2 = new JButton("New York");
        JButton b3 = new JButton("London");


        add(b1);
        add(b2);
        add(b3);
    }
}

class CountriesPane extends JPanel{


//create a 3 checkboxes and add to panel

    public CountriesPane() {
        JCheckBox box1 = new JCheckBox("United States");
        JCheckBox box2 = new JCheckBox("Britian");
        JCheckBox box3 = new JCheckBox("Britain");

        add(box1);
        add(box2);
        add(box3);

    }
}


public class JTabbedPaneDemo extends JFrame {

    public JTabbedPaneDemo(){

        Container c = this.getContentPane();

//        create tabbed pane
        JTabbedPane pane = new JTabbedPane();

//        add two sheet capitalspanel and countries panel are classes. which is extended JPanel and contain
//        a group of components.

        pane.add("Capital" , new CapitalPane());
        pane.add("Countries" , new CountriesPane());

//        add the tabbed pane to content pane
        c.add(pane);
    }

    public static void main(String[] args) {

        JTabbedPaneDemo demo = new JTabbedPaneDemo();
        demo.setSize(500 , 400);
        demo.setVisible(true);
        demo.setTitle("Tabbed pane");

        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
