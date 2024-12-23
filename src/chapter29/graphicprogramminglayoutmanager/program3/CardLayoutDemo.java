package chapter29.graphicprogramminglayoutmanager.program3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* A program to create a group of push button and add them to the container using cardlayout
*
* */
public class CardLayoutDemo  extends JFrame implements ActionListener {
    Container c;
    CardLayout card;
    JButton b1 , b2 , b3 , b4;

    public CardLayoutDemo(){
        c = getContentPane();
//        create CardLayout object with 50 px horizontal space
//        and 10px vertical space

        card = new CardLayout(50 , 10);

        c.setLayout(card);

        b1 = new JButton("button1");
        b2 = new JButton("button2");
        b3 = new JButton("button3");
        b4 = new JButton("button4");


//        add each button to c on a separate card
        c .add("First card" , b1);
        c.add("Second card" , b2);
        c.add("Third card" , b3);
        c.add("Fourth card" , b4);



//        add action Listeners to button

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        when a button is clicked show the next card
        card.next(c);
//        To show a particular card eg. Third card we can use as:
        card.show(c , "third card");


    }

    public static void main(String[] args) {
        CardLayoutDemo demo = new CardLayoutDemo();
        demo.setSize(500 , 400);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
