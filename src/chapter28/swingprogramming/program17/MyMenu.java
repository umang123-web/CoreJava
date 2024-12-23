package chapter28.swingprogramming.program17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
* A program to create a menu with several menu items
*
* */
public class MyMenu extends JFrame implements ActionListener {

    JMenuBar mb;
    JMenu file , edit , font;
    JMenuItem op , sa , cl , cp , ct , pt , f1, f2;
    JCheckBoxMenuItem pr;


    public MyMenu(){
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());

//        create a menu bar
        mb = new JMenuBar();
//    add menubar in content
        c.add("North" , mb);

//        create the file , edit , menu

//        and attach them to menubar
        file = new JMenu("file");
        edit = new JMenu("edit");
        mb.add(file);
        mb.add(edit);

//        create menu items
        op = new JMenuItem("Open");
        sa = new JMenuItem("Save");
        cl = new JMenuItem("Close");
        cp = new JMenuItem("Copy");
        pt = new JMenuItem("Paste");

//        add open , save , close to File menu
//        and copy p, paste , to edit Menu

        file.add(op);
        file.add(sa);
        file.add(cl);
        file.add(cp);
        file.add(pt);

//        make close disabled
        cl.setEnabled(false);

//        create Print checkbox and add it to file Menu
        pr = new JCheckBoxMenuItem("Print");
        file.add(pr);
//        add seperator (horizontal line) to file menu
        file.addSeparator();

//        create a font submenu and add it to FileMenu
        font = new JMenu("Font");
        file.add(font);

        f1 = new JMenuItem("Arial");
        f2 = new JMenuItem("Times New Roman");

//        add menu items to sub menu

        font.add(f1);
        font.add(f2);

//        attach listener to all menu items

        op.addActionListener(this);
        sa.addActionListener(this);
        cl.addActionListener(this);
        cp.addActionListener(this);
        pt.addActionListener(this);
        pr.addActionListener(this);
        f1.addActionListener(this);
        f2.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }





    @Override
    public void actionPerformed(ActionEvent e) {

//        know which menu item is clicked

        if(op.isArmed()) System.out.println("open is selected");
        if(sa.isArmed()) System.out.println("save is selected");
        if(cl.isArmed()) System.out.println("Close is selected");
        if(cp.isArmed()) System.out.println("Copy is selected");
        if(pt.isArmed()) System.out.println("Paste is armed");

        if(pr.getModel().isSelected()) System.out.println("printing...");
        else System.out.println("printing is off....");

        if(f1.isArmed()) System.out.println("Arial font is selected");
        if(f2.isArmed()) System.out.println("Times NEw Roman is selected");
    }

    public static void main(String[] args) {
        MyMenu mm = new MyMenu();
        mm.setSize(400 ,400);
        mm.setVisible(true);
    }
}
