package chapter28.swingprogramming.program22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* A program to create a color chooser dialog box for the user to select a color from
* and the selected color is displayed as background color for the frame
*
* */
public class JColorDemo extends JFrame implements ActionListener {

    JButton b;
    Container c;

    public JColorDemo(){
        c = getContentPane();
        c.setLayout(new FlowLayout());

        b = new JButton("select a color");

        c.add(b);
        b.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
//        take the inital color as null
        Color selectedColor = null;

//        create the color chooser with dialog box to select a color
        Color color =JColorChooser.showDialog(this , "select a color" , selectedColor);

//        if color is not null then some color is selected
        if(color !=null){
//            get the selectedcolor
            selectedColor = color;
        }
//        show the background color of frame with selected color
        c.setBackground(color);
    }

    public static void main(String[] args) {
        JColorDemo demo = new JColorDemo();
        demo.setSize(500 , 500);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
