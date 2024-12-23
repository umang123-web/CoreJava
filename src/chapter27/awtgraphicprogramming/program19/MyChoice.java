package chapter27.awtgraphicprogramming.program19;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
* A program to create a choice with names of some languages from where the user
* has to select any one item. The selected item must also be displayed in the frame
*
* */
public class MyChoice extends Frame implements ItemListener {

    String message;
    private Choice choice;

    public MyChoice(){
//        set layout to frame

        setLayout(new FlowLayout());

//        create an empty choice menu
        choice =new Choice();

//        add some items to choice menu

        choice.add("English");
        choice.add("Hindi");
        choice.add("French");
        choice.add("Spanish");

//        add the choice menu to frame

        add(choice);

//        add itemListener to choice menu

        choice.addItemListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

//    this method is called when an item is clicked
    @Override
    public void itemStateChanged(ItemEvent e) {

        repaint();
    }

//    display selected item from the choice menu
    public void paint(Graphics g){
        g.drawString("selected language:" , 10 , 100);
        message = choice.getSelectedItem();
        g.drawString(message , 10 ,120);
    }

    public static void main(String[] args) {
        MyChoice c= new MyChoice();
        c.setSize(500 ,500);
        c.setVisible(true);
    }
}
