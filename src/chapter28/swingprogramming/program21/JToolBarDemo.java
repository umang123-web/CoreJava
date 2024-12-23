package chapter28.swingprogramming.program21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.ImageGraphicAttribute;

/*
* A program to create a tool bar with 3 push button added to it. The push buttons are created with images
* to denote a new , open and print options. When the user clicks on any button , the selected button is
* displayed in the label
*
*
* */
public class JToolBarDemo  extends JFrame implements ActionListener {

    String str;
    Container c;
    JToolBar bar;
    JButton b1 , b2 , b3;
    JLabel label;


    public JToolBarDemo(){
        Container c= this.getContentPane();
        c.setLayout(new BorderLayout());


//        create tool bar
        bar = new JToolBar();
//        set etched border around the tool bar
        bar.setBorder(BorderFactory.createEtchedBorder(Color.green , Color.BLACK));

//        load images with imageIcon objects
        ImageIcon img1 , img2 , img3;

        img1 = new ImageIcon("images.jpeg");
        img2 = new ImageIcon("open.jpeg");
        img3 = new ImageIcon("print.gif");

//        create 3 push button with images

        b1 = new JButton(img1);
        b2 = new JButton(img2);
        b3 = new JButton(img3);

//        add the push button to the tool bar
        bar.add(b1);
        bar.add(b2);
        bar.add(b3);


//        add the tool bar in c at top

        c.add("North" , bar);

//        create a label and add to c at Center

        label = new JLabel();
        label.setFont(new Font("SabsSerif" , Font.PLAIN , 30));
        c.add("Center" , label);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {


//        know which button is clicked
        if(e.getSource() ==b1) str="New Clicked";
        if(e.getSource() == b2) str ="Open clicked";
        if(e.getSource() == b3) str ="Print clicked";

//        display the string in the label
        label.setText(str);
    }

    public static void main(String[] args) {
        JToolBarDemo demo = new JToolBarDemo();
        demo.setSize(500 , 400);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
