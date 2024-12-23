package chapter27.awtgraphicprogramming.program6;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
* A program to draw a smiling face using the Graphics class
* */
public class Draw extends Frame {

    public Draw(){
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }

//    to refresh the frame contents
    public void paint(Graphics g){
        g.setColor(Color.blue);
//        display a rectangle to contain drawing

              g.drawRect(40 , 40 , 200 , 200);

//              face
        g.drawOval(90 , 70 , 80 , 80);
//        eyes
        g.drawOval(110 , 95 , 5 , 5);
        g.drawOval(145 , 95 , 5 , 5);

//        nose
        g.drawLine(130 , 95 , 130 , 115);

//    mouth
        g.drawArc(113 , 115 , 35 , 20 , 0 , -180);

    }

    public static void main(String[] args) {
        Draw draw = new Draw();
        draw.setTitle("My drawing");
        draw.setSize(400 , 400);
        draw.setVisible(true);

    }
}
