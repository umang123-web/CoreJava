package chapter27.awtgraphicprogramming.program24;

import chapter27.awtgraphicprogramming.program23.Frame1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame2 extends Frame implements ActionListener {
//    create a button
    Button b;

    int n;
    String name;
    public Frame2(int n , String name){
        this.n = n;
        this.name = name;

//        set layout to flow layout
        setLayout(new FlowLayout());


        b= new Button("Back");
//        add it to the frame

        add(b);
        b.addActionListener(this);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
//        remove this frame from memory


        this.dispose();
    }

    public static void main(String[] args) {

    }

}
