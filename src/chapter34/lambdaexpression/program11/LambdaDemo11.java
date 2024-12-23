package chapter34.lambdaexpression.program11;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* A program to display a message when a push button is clicked using Lambda expression
*
* */
public class LambdaDemo11 {

    public static void main(String[] args) {
        JButton button = new JButton("click this button");
//        here we are passing anonymous inner class object to
//        addActionListener method

        button.addActionListener(e->{
            System.out.println("I am a thread of lambda expression");
        });

        JFrame  frame = new JFrame();
        frame.getContentPane().add(button);
        frame.setSize(400 , 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true );

    }
}
