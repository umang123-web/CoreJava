package chapter28.swingprogramming.program9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* A program that help in creating some check boxes and radio buttons. when the user clicks
* on a check box or radio button the selected option text will be displayed in the text area
*
* */
public class CheckRadio extends JFrame implements ActionListener {

    JCheckBox c1 , c2;
    JRadioButton b1 , b2;
    JTextArea ta;
    ButtonGroup bg;
    String message="";

    public CheckRadio(){
//        create the content pane

        Container c = this.getContentPane();



//        set flow layout to content pane
           c.setLayout(new FlowLayout());
//           create a text area with 10 rows and 20 chars per row

        ta = new JTextArea(10 , 20);

//        create two checkboxes
        c1 = new JCheckBox("Java" , true);
        c2 = new JCheckBox("J2EE");

//        create a button group and add the radio button to it.

        b1 = new JRadioButton("Male" , true);
        b2= new JRadioButton("Female");


//        create a button group and add the radio button to it

        bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);

//        add the checkboxes , radio button, text area to the container

        c.add(c1);
        c.add(c2);
        c.add(b1);
        c.add(b2);
        c.add(ta);

//        add action listener . We need not add listener to text area
//        since the user click on the checkboxes or radio buttons only

        c1.addActionListener(this);
        c2.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

//        know which component are selected by user
        if (c1.getModel().isSelected()) message += "\nJava";
        if (c2.getModel().isSelected()) message += "\nJ2EE";
        if (b1.getModel().isSelected()) message += "\nMale";

        else message+="\n female";
//        display the selected message in text area

        ta.setText(message);

//        reset the message to empty string
        message="";

    }

    public static void main(String[] args) {
        CheckRadio radio = new CheckRadio();
        radio.setSize(500 , 400);
        radio.setVisible(true);

    }
}
