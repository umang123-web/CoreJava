package chapter27.awtgraphicprogramming.program20;

import chapter27.awtgraphicprogramming.program17.MyRadio;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.StringReader;

/*
* A program to create a list box with names of some languages from where the user
* can select one or more item
*
* */
public class MyList extends Frame implements ItemListener {

    int []message;

    List list;
    public MyList(){
        setLayout(new FlowLayout());
//        create an empty list box that displays 4 item initally  and multiple selection is also enabled

        list = new List(4 , true);

//        add item to the list box
        list.add("English");
        list.add("Hindi");
        list.add("Sanskrit");
        list.add("French");
        list.add("Spanish");


//        add the list box to frame

        add(list);

//        add item listener to the list box
        list.addItemListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }



    @Override
    public void itemStateChanged(ItemEvent e) {

        repaint();
    }

    public void paint(Graphics g){
        g.drawString("Selected languages:" , 10 ,120);

//        get the selected item position numbers into message[]

        message =list.getSelectedIndexes();
//        know each selected item name and display

        for(int i=0; i<message.length; i++){
            String item = list.getItem(message[i]);
            g.drawString(item , 100 , 220+i*20);
        }

    }

    public static void main(String[] args) {
        MyList ml = new MyList();
        ml.setSize(400 , 400);
        ml.setVisible(true);
    }
}
