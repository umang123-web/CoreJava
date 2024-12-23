package chapter29.graphicprogramminglayoutmanager.program6;

import javax.swing.*;
import java.awt.*;

/*
* A program is designed to display 5 push button using GridBagLayout Manager as certain
* positions. Please observe the output of the program first and then observe one by one
* the constraint set to the button
*
*
* */
public class GridBagLayoutDemo extends JFrame {

    GridBagLayout gbag;
    GridBagConstraints cons;
    GridBagLayoutDemo(){

        Container c = getContentPane();

//        create Gridbaglayout object

        gbag = new GridBagLayout();

//        set the layout to GridBagLayout
        c.setLayout(gbag);


        cons = new GridBagConstraints();

//        create 5 push buttons
        JButton b1 = new JButton("button1");
        JButton b2 = new JButton("button2");
        JButton b3 = new JButton("button3");
        JButton b4 = new JButton("button4");
        JButton b5 = new JButton("button5");

//        for all button use Horizontal filling

        cons.fill =GridBagConstraints.HORIZONTAL;

//        display button1 and x, y coordinates 0 , 0

        cons.gridx =0;
        cons.gridy=0;

//        resize all the components when the frame is resized
        cons.weightx=0.7;
        cons.weighty=0.7;

//        see the above constraint to button1

        gbag.setConstraints(b1 , cons);

//        add button1 to content pane

        c.add(b1);

//        display button2 at x , y coordinates 1 , 0

        cons.gridx=1;
        cons.gridy=0;

//        remaining constraints applicable as set for previous button
//        set constraint to button2
        gbag.setConstraints(b2 , cons);
        c.add(b2);

//        display button3 at x , y coordinates 2 , 0
        cons.gridx =2;
        cons.gridy=0;

        gbag.setConstraints(b3 , cons);

  c.add(b3);

//  display button4 at x , y coordinates 0 , 1
        cons.gridx=0;
        cons.gridy=1;

//        add 100px height-wise
        cons.ipady=100;

//        let button4 occupy 3 column  width-wise
        cons.gridwidth=3;

//        remaining constraint applicable as set for previous button
        gbag.setConstraints(b4 , cons);

        c.add(b4);
//        display button5 at x , y coordinates 1 , 2
        cons.gridx=1;
        cons.gridy=2;

//        reset the ipady to value 0

        cons.ipady=0;

//        leave space above the button for resizing vertically
        cons.weighty=0.8;

//        position the button starting from center of bottom line
        cons.anchor=GridBagConstraints.PAGE_END;

//        leave 50px space at bottom of button5

        cons.insets = new Insets(0 , 0 , 50 ,0);

//        let the button occupy 2 column width
        cons.gridwidth=2;
//        set constraint to button5
        gbag.setConstraints(b5 , cons);
        c.add(b5);

    }

    public static void main(String[] args) {
        GridBagLayoutDemo demo = new GridBagLayoutDemo();
        demo.setSize(500 , 500);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
