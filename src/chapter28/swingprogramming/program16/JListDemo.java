package chapter28.swingprogramming.program16;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ItemListener;

/*
* A program to create a list box with names of some countries such that the user can select any one or more items from
* the list and the selected country names are displayed again from the frame
*
* */
public class JListDemo extends JFrame implements ListSelectionListener {


    JList list;
    JLabel label;
    Object arr[];
    String message="";


    public JListDemo(){

        Container c = this.getContentPane();
        c.setLayout(null);

//        create an array with item list
        String items[] ={"America" , "Italy" , "London" , "Germany"};

//        create a list box with the item
        list = new JList(items);

//        set the location of list item
        list.setBounds(100 , 50 , 100 , 100);

        c.add(list);

//        create an empty label
        label = new JLabel();

        label.setBounds(50 , 200 , 400 , 40);

//        add the label to content pane
        c.add(label);

//        attach item listener to the list box

        list.addListSelectionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    @Override
    public void valueChanged(ListSelectionEvent e) {

//        know which item are selected


        arr =list.getSelectedValues();
//        retrieve selected items and add to String message
        for(int i=0; i< arr.length; i++){
            message+=(String) arr[i];
//            display the selected items in the label
            label.setText("Selected:" + message);
//            reset the string
            message="";
        }
    }

    public static void main(String[] args) {
        JListDemo demo = new JListDemo();
        demo.setSize(400 , 400);
        demo.setVisible(true);
    }
}
