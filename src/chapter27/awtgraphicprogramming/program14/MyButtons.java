package chapter27.awtgraphicprogramming.program14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
* A program that helps in creating 3 push buttons bearing the names of 3 colors
* When a button is clicked , the color associated with it set as the background
* color in the frame
*
* */
public class MyButtons extends Frame implements ActionListener {

    private Button b1;
    private Button b2;
    private Button b3;



    public MyButtons(){
//        do not set any layout
        this.setLayout(null);

        b1 = new Button("Yellow");
        b2=new Button("Pink");
        b3 = new Button("green");

//        set the locations of button in the frame
        b1.setBounds(100 , 100 , 70 , 40);
        b2.setBounds(100 , 160 , 70 , 40);
        b3.setBounds(100 , 220 , 70 , 40);

//        add the button to the frame

        this.add(b1);
        this.add(b2);
        this.add(b3);

//        add action listener to the button
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

//    this method is called when a button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
//        know the label of the button clicked by the user
        String str= e.getActionCommand();

//        change the frame s' background color depending on the button
//        clicked
        if(str.equalsIgnoreCase("yellow")) this.setBackground(Color.yellow);
        if(str.equalsIgnoreCase("pink")) this.setBackground(Color.pink);
        if(str.equalsIgnoreCase("green")) this.setBackground(Color.green);


    }

    public static void main(String[] args) {
        MyButtons mb = new MyButtons();
        mb.setSize(400 , 400);
        mb.setTitle("My button");
        mb.setVisible(true);
    }
}
