package chapter27.awtgraphicprogramming.program21;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyScroll extends Frame implements AdjustmentListener {

    String message="";
    Scrollbar scrollbar;


    public MyScroll(){
        setLayout(new FlowLayout());


//        create a vertical scrollbar
        scrollbar = new Scrollbar(Scrollbar.VERTICAL , 0 , 30 , 0 , 400);
//        set the location of scrollbar in the frame

        scrollbar.setBounds(250 , 50 , 30 , 200);
//        add it to the frame

        add(scrollbar);

//        add listener
        scrollbar.addAdjustmentListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {

        repaint();
    }

    public void paint(Graphics g){
//        display the position of scrollbar
        g.drawString("Scrollbar position:" , 20 ,150);
        message+=scrollbar.getValue();
        g.drawString(message , -20 , 180);
        message="";
    }

    public static void main(String[] args) {
        MyScroll mc = new MyScroll();
        mc.setSize(400 , 400);
        mc.setVisible(true);
        mc.setTitle("myh Scrollbar")    ;
    }
}
