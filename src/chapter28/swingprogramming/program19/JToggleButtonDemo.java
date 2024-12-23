package chapter28.swingprogramming.program19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* A program to show the functioning of a toggle button
*
* */
public class JToggleButtonDemo extends JFrame implements ActionListener {


    JToggleButton button;
    ImageIcon img;

    public JToggleButtonDemo(){
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());

//        image with start signal
        img = new ImageIcon("start.gif");

//        create toggle button with start image
        button = new JToggleButton("Start / Stop" , img);

//        add button to pane
        c.add(button);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

//        image with stop signal
        ImageIcon img2 = new ImageIcon("stop.gif");
//        if toggle button is selected display stop image
//        else display start signal image

        if(button.isSelected()){
            button.setIcon(img2);

        }else{
            button.setIcon(img);
        }
    }

    public static void main(String[] args) {
        JToggleButtonDemo demo = new JToggleButtonDemo();
        demo.setSize(500 , 500);
        demo.setVisible(true);
    }
}
