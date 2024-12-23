package chapter28.swingprogramming.program4;

/*
* A program to display text in the frame by overriding paintComponent()
* of JPanel class
* */

import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel{
    MyPanel (){
        this.setBackground(Color.green);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.setFont(new Font("Helvertica" , Font.BOLD , 34));
        g.drawString("Hello Learner" , 50 ,100);
    }
}
public class FrameDemo extends  JFrame{

    public FrameDemo(){


        Container c = this.getContentPane();
        MyPanel ml= new MyPanel();
        c.add(ml);

    }
    public static void main(String[] args) {
       FrameDemo frame = new FrameDemo();

       frame.setVisible(true);
       frame.setSize(400 , 400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
