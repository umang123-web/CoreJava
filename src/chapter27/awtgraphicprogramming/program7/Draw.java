package chapter27.awtgraphicprogramming.program7;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
* A program that allows you to fill the shapes with colors
*
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


          public void paint(Graphics g){

//        set blue color

              g.setColor(Color.blue);

//              display a rectangle to contain drawing
              g.fillRect(40 , 40 , 200 , 200);


//              set yellow color
              g.setColor(Color.yellow);

//              face
              g.fillOval(90, 70 , 80 , 80);


//    set black color
              g.setColor(Color.black);
              g.fillOval(110,95 , 5 , 5);
              g.fillOval(145 , 95 , 5 , 5);


//              nose
              g.drawLine(130 , 95, 130 , 115);

//              set red color

              g.setColor(Color.red);
              g.fillArc(113 , 115 , 35 , 20 , 0 , -180);

    }

    public static void main(String[] args) {
        Draw draw = new Draw();
        draw.setTitle("My colorful drawing");
        draw.setSize(500 , 500);
        draw.setVisible(true);
    }


}

