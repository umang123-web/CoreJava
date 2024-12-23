package chapter28.swingprogramming.program13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* A program that creates a split pane which divides the frame into two parts Horizontally and vertically
*. In horizontally the left part we create a button and in the right part , we create a text area. When the button
* is clicked, the text is displayed inside the text area
*
* */
public class JSplitPaneDemo extends JFrame implements ActionListener {
String str ="this is my text being displayed in the text area" + "and this text will be wrapped accordingly";

JButton b;
JTextArea ta;
JSplitPane pane;


public JSplitPaneDemo(){


    Container c = this.getContentPane();

    c.setLayout(new BorderLayout());

//    create a push button and text area
    b= new JButton("My Button");
    ta = new JTextArea();

//    set wrapping of the line for text area
    ta.setLineWrap(true);

//    create horizontal split pane that contain b, ta

    pane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT , b , ta);

//set the divider location at 300px in split pane

    pane.setDividerLocation(300);

//    add the split pane in the center of container

    c.add( "Center", pane);

//    add action Listener to the button
    b.addActionListener(this);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}


    @Override
    public void actionPerformed(ActionEvent e) {
        ta.setText(str);
    }

    public static void main(String[] args) {
        JSplitPaneDemo demo = new JSplitPaneDemo();
        demo.setSize(400 , 400);
        demo.setVisible(true);

    }
}
