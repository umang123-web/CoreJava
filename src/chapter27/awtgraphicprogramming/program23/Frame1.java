package chapter27.awtgraphicprogramming.program23;

import chapter27.awtgraphicprogramming.program24.Frame2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
* A program to create a frame Frame1 with Next and Close buttons
*
* */
public class Frame1 extends Frame implements ActionListener {

    Button b1 , b2;
    public Frame1(){
        setLayout(null);

//        create two buttons
        b1 = new Button("Next");
        b2 = new Button("Close");

//        set the locations of buttons
        b1.setBounds(100 , 100 , 70 , 40);
        b2.setBounds(200 , 100 , 70 , 40);

//        add them to the frame

        add(b1);
        add(b2);

//        add action listener to buttons
        b1.addActionListener(this);
        b2.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }


    @Override
    public void actionPerformed(ActionEvent e) {
//        if Next button is clicked display frame2

        if(e.getSource() == b1){
//            create frame2 object and display

            Frame2 frame2 = new Frame2(1 , "Umang");
            frame2.setVisible(true);
            frame2.setSize(400 , 400);
        }else{
//            if close button is clicked close application
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        Frame1 f1 = new Frame1();
        f1.setSize(500 , 500);
        f1.setVisible(true);
        f1.setTitle("First frame");
    }
}
