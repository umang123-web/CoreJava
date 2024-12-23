package chapter27.awtgraphicprogramming.program8;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
* A program to create a polygon that is filled with green color. This polygon must be
* created inside a rounded rectangle which is filled with red color
* */
public class DrawPoly extends Frame {

    public DrawPoly(){
       this.addWindowListener(new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent e) {
               System.exit(0);
           }
       });
    }

    public void paint(Graphics g){

//        set color
        g.setColor(Color.red);
//        display fill rounded rectangle

        g.fillRoundRect(30 , 30 , 250 , 250 , 30 , 30);

//        set green color
        g.setColor(Color.green);

//        take x and y coordinates in arrays
        int x[] ={40 , 200 , 40 , 100};
        int y[] ={40 , 40 , 200 , 200};

//        there are 4 pairs of x , y coordinates
        int num =4;
//        create filled ploygon connecting the coordinates
        g.fillPolygon(x , y , num);
    }

    public static void main(String[] args) {
        DrawPoly poly = new DrawPoly();
        poly.setTitle("Polygon drawing");
        poly.setSize(400 , 400);
        poly.setVisible(true);
    }
}
