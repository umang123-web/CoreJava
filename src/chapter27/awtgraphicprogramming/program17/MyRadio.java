package chapter27.awtgraphicprogramming.program17;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
* A program that creates 2 radio buttons yes and No. The user selects
* a button from them and display the selected button label
* */
public class MyRadio extends Frame implements ItemListener {

    String message ="";
    private CheckboxGroup cbg;
    private Checkbox y , n;



    public MyRadio(){
//        set the layout to flow layout
        setLayout(new FlowLayout());

//        create checkbox group object
        cbg = new CheckboxGroup();
//        create 2 radio buttons to frame
        y= new Checkbox("Yes" , cbg , true);
        n =new Checkbox("no" , cbg , false);

    add(y);
    add(n);


//    add the item listener to the radio buttons

        y.addItemListener(this);
        n.addItemListener(this);


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
//    this method is called when a  radio button is clicked
    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }

//    display the selected radio button
    public void paint(Graphics g ){
        message = "current selection: ";
        message+=cbg.getSelectedCheckbox().getLabel();
        g.drawString(message , 10 , 100);
    }

    public static void main(String[] args) {
        MyRadio mr = new MyRadio();
        mr.setSize(400 , 400);
        mr.setTitle("My Radio");
        mr.setVisible(true);
    }
}
