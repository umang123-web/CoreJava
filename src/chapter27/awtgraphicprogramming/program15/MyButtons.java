package chapter27.awtgraphicprogramming.program15;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
* A program to create push buttons arrange them using FlowLayout manager and setting
* the background color for the frame depending on the button clicked by the user
* */
public class MyButtons  extends  Frame implements ActionListener {

    private Button b1;
    private Button b2;
    private Button b3;


public MyButtons(){
//    do not set any layout

    setLayout(new FlowLayout());

//    create 3 push buttons
    b1 = new Button("Yellow");
    b2 = new Button("pink");
    b3 = new Button("green");


//    add the button to the frame
    add(b1);
    add(b2);
    add(b3);

//    add action listener to the buttons
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

///   this method is called when a button is clicked
//


    @Override
    public void actionPerformed(ActionEvent e) {

    if(e.getSource() ==b1)this.setBackground(Color.yellow);
    if(e.getSource() ==b2)this.setBackground(Color.pink);
    if(e.getSource() == b3)this.setBackground(Color.green);
    }

    public static void main(String[] args) {
        MyButtons bt = new MyButtons();
        bt.setSize(400 , 400);
        bt.setVisible(true);
    }
}
