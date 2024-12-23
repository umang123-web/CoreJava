package chapter27.awtgraphicprogramming.program10;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
* Displaying a group of dots on black screen
*
* */
public class Points extends Frame {



    public void paint(Graphics g){
//        set white color for dots
        g.setColor(Color.WHITE);
        for(;;) {  //display dots forever

//            generate x , y coordinates randomly Maximum 800 and minimum 600
            int x = (int)Math.random()*800;
            int y =(int) Math.random()*600;

//            use drawLine() to display a dot
            g.drawLine(x , y , x , y);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
//        create frame
        Points p = new Points();
//        set background color for frame
        p.setBackground(Color.black);
//        set the size and title for frame
        p.setSize(500 , 400);
        p.setTitle("Random dots");
        p.setVisible(true);
    }

}
