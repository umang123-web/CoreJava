package chapter27.awtgraphicprogramming.program9;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
* A program to draw a home with moon in the background
* */

public class Home extends Frame {

public Home(){
    this.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });
}


    public void paint(Graphics g){
//    store x y, coordinates in x[] , y[]

        int x[] ={375 , 275 , 475};
        int y[] ={125 , 200 , 200};

        int n=3;
//        set gray background color

        this.setBackground(Color.gray);
//        set yellow color for rectangle -house
        g.setColor(Color.yellow);
        g.fillRect(300 , 200 , 150 , 100);

//        set blue color for another rectangle - door
        g.setColor(Color.blue);
        g.fillRect(350 , 210 , 50 , 60);

//        draw a line - line below the door
        g.drawLine(350 , 280 ,400 , 280);

//        set dark gray for polygon -roof
        g.setColor(Color.darkGray);
        g.fillPolygon(x , y , n);

//        set cyan color for oval moon
        g.setColor(Color.cyan);
        g.fillOval(100 , 100 , 60 , 60);
//        set green for arcs - grass
        g.setColor(Color.green);
        g.fillArc(50, 250 , 150 , 100 , 0 , 180);
        g.fillArc(150 , 250 , 150 , 100 , 0 , 180);
        g.fillArc(450 , 250 , 150 , 100 , 0 , 180);

//        draw a line -the bottom most line of drawing
        g.drawLine(50 , 300 ,600 , 300);

        g.drawString("Happy Home" , 275 , 350);
}


    public static void main(String[] args) {

    Home h = new Home();
    h.setTitle("Home drawing");
    h.setSize(500 , 400);
    h.setVisible(true);
    }
}
