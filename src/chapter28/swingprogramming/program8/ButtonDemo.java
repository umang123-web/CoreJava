package chapter28.swingprogramming.program8;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* A program in which we created a push button with a label and image on it
* and then set different features for the button
*
* */
public class ButtonDemo extends JFrame implements ActionListener {

    JButton b;
    JLabel ll;
    public ButtonDemo(){
//        create container
        Container c = this.getContentPane();

//        set layout for a container
        c.setLayout(new FlowLayout());

//        store the image into imageIcon object
        ImageIcon ii =new ImageIcon("car2.gif");

//        create the button with the image
        b= new JButton("click me" , ii);
//        set background and foreground color for button
        b.setBackground(Color.yellow);
        b.setForeground(Color.red);


//        set font for the label of button
        b.setFont(new Font("Arial" , Font.BOLD , 30));

//        set bevel border for button
        Border bd =BorderFactory.createBevelBorder(BevelBorder.RAISED);
        b.setBorder(bd);
//        set tool tip text for button
        b.setToolTipText("this is button");

//        set a short cut key for button. Alt + C from keyboard will
//        invoke the button

        b.setMnemonic('c');
//        add button to the container
        c.add(b);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.addActionListener(this);
        ll = new JLabel();
        c.add(ll);

    }

    public static void main(String[] args) {
        ButtonDemo bj = new ButtonDemo();
        bj.setSize(500 , 400);
        bj.setVisible(true);
        bj.setTitle("Hello button");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        set some image to the label. this image is displayed when the
//        button clicked
        ImageIcon ii = new ImageIcon("car2.gif");
        ll.setIcon(ii);
    }


}
