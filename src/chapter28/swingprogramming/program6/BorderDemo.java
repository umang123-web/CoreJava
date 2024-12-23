package chapter28.swingprogramming.program6;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;

/*
* A program to create some push buttons using JButton class and draw a different border around the buttons
* */
public class BorderDemo extends JFrame {

    JButton b1 , b2 , b3 , b4 , b5 , b6 , b7 , b8;

    public BorderDemo(){
//        create content pane c

        Container c = this.getContentPane();

//        set layout for content pane
        c.setLayout(new FlowLayout());


//        create push button

        b1 = new JButton("Raised Bevel button");
        b2 = new JButton("Lowered Bevel button");
        b3 =new JButton("Raised Etched button");
        b4 = new JButton("Lowered Etched button");
        b5 = new JButton("Line Border");
        b6= new JButton("Matte Border");
        b7 = new JButton("Compound Border");
        b8 = new JButton("Empty border");

//    set raised bevel border for b1 with high light color
//        red and shadow color: green

        Border bd = BorderFactory.createBevelBorder(BevelBorder.RAISED , Color.red , Color.green);
        b1.setBorder(bd);

//        set lowered bevel border for b2 with its current background

        bd = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        b2.setBorder(bd);

//        set raised etched border for b3 with high light color :red
//        and shadow color:green

        bd=BorderFactory.createEtchedBorder(EtchedBorder.RAISED , Color.red , Color.green);
        b3.setBorder(bd);

        bd=BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        b4.setBorder(bd);

//        set line border for b5 with red color and width 5px
        bd=BorderFactory.createLineBorder(Color.red , 5);
        b5.setBorder(bd);

//        set matte border for b6 with top , left , bottom ,right width as 5, 10 , 15 , 20px and in red color

        bd=BorderFactory.createMatteBorder(5, 10 , 15 , 20 , Color.red);
        b6.setBorder(bd);

//        set compound border for b7 without any borders inside or outside edge

        bd=BorderFactory.createCompoundBorder();
        b7.setBorder(bd);


//        set empty border for b8 without any space for border

        bd =BorderFactory.createEmptyBorder();
        b8.setBorder(bd);

//        add buttons to the container

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        BorderDemo borderDemo = new BorderDemo();
        borderDemo.setSize(500 , 500);
        borderDemo.setVisible(true);
        borderDemo.setTitle("my border");

    }
}
