package chapter28.swingprogramming.program15;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
* A program to create a combo box with the names of some countries. The user can select any one name
* from the list and the selected country name is displayed again in the frame
*
* */
public class JComboBoxDemo extends JFrame implements ItemListener {

    JComboBox box;
    JLabel label;


    public JComboBoxDemo(){
        Container c = this.getContentPane();
        c.setLayout(null);
//        create an empty combobox
        box = new JComboBox();
//        add item to it


        box.addItem("America");
        box.addItem("Italy");
        box.addItem("London");
        box.addItem("Germany");


//        set the location of combo box
        box.setBounds(100 , 50 , 100 , 40);
//        add box to container

        c.add(box);

        label = new JLabel();

//        set the location of label

        label.setBounds(100 , 200 , 200 , 40);

        c.add(label);

//        attach item listener to combo box

        box.addItemListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {


//        know which item is selected
        String str = (String) box.getSelectedItem();
//        display the selected item in the label

        label.setText("You selected:" + str);
    }

    public static void main(String[] args) {
        JComboBoxDemo demo = new JComboBoxDemo();
        demo.setSize(400 , 400);
        demo.setVisible(true);
    }
}
