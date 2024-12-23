package chapter27.awtgraphicprogramming.program16;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyCheckbox extends Frame implements ItemListener {

    String message="";

    private Checkbox c1;
    private Checkbox c2;
    private Checkbox c3;

    public MyCheckbox(){
//        set flow layout manager

          setLayout(new FlowLayout());
        c1 = new Checkbox("Bold" , true);
        c2= new Checkbox("Italic");
        c3 = new Checkbox("underline");

        add(c1);
        add(c2);
        add(c3);

//        add item listener to the checklistener

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

//    this method is called the user click on a check box
    @Override
    public void itemStateChanged(ItemEvent e) {
     repaint(); //call the paint method
    }

    public void paint (Graphics g){
        g.drawString("current state:" , 10 , 100);
        message ="Bold:" + c1.getState();
        g.drawString(message , 10 ,120);
        message="Italic:" + c2.getState();
        g.drawString(message , 10 ,140);
        message ="underline:" + c3.getState();
        g.drawString(message , 10 , 160);
    }

    public static void main(String[] args) {
//        create the frame

        MyCheckbox checkbox = new MyCheckbox();
        checkbox.setSize(400 ,400);
        checkbox.setTitle("My Checkbox");
        checkbox.setVisible(true );
    }
}
