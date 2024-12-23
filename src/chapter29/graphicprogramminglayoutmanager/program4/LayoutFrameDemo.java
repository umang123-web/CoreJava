package chapter29.graphicprogramminglayoutmanager.program4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* A program to add a group of components : a text field , a checkbox , and a push button using border layout
* to a panel. Then the panel object is added in the container which uses card layout
*
* */
public class LayoutFrameDemo extends JFrame implements ActionListener {

    Container c;
    CardLayout card;
    JButton b1;


    public LayoutFrameDemo(){
        c = getContentPane();
        card = new CardLayout();
        c.setLayout(card);

        b1 = new JButton("Button1");
        c.add( "first card",b1);

        b1.addActionListener(this);

//        add panel object to c on second card
//        MyPanel is the sub class of Panel class

        c.add("second card" , new MyPanel());




    }
    @Override
    public void actionPerformed(ActionEvent e) {
        card.next(c);

    }

    public static void main(String[] args) {

        LayoutFrameDemo demo = new LayoutFrameDemo();
        demo.setSize(500 , 500);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MyPanel extends JPanel{
    JTextField tf;
    JCheckBox box;
    JButton button;

    public MyPanel(){
//        set the border layout
        this.setLayout(new BorderLayout());

//        create components
        tf = new JTextField("Text field" , 15);
        button = new JButton("Ok");
        box = new JCheckBox("check box");

//        add them to panel
        this.add("North" , tf);
        this.add("South" , button);
        this.add("East" , box);

    }
}
