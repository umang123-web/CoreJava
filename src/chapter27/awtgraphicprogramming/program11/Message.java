package chapter27.awtgraphicprogramming.program11;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
* A program to display some text in the frame using drawString() method.
*
* */
public class Message extends Frame {

    public Message(){
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g){
//        set background color for frame
        this.setBackground(new Color(100 , 20 , 20));

//        set font for the text
        Font f = new Font("Arial" , Font.BOLD+ Font.ITALIC , 30);
        g.setFont(f);
//        set foreground color
        g.setColor(Color.green);

//        display message
        g.drawString("Hello how are you?" , 100 , 100);
    }


    public static void main(String[] args) {
        Message message = new Message();
        message.setTitle("My Message");
        message.setSize(400 , 400);
        message.setVisible(true);
    }
}
