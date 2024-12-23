package chapter28.swingprogramming.program18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/*
* A program to create a menu and handle the file open event for the user
*
* */
public class MyMenu extends JFrame implements ActionListener {

    JMenuBar bar;
    JMenu file , edit , font;
    JMenuItem op , sa , cl , cp , pt , f1 , f2;
    JCheckBoxMenuItem pr;


    public MyMenu(){
        Container c = this.getContentPane();

        c.setLayout(new BorderLayout());

//        create a menubar
        bar = new JMenuBar();
        c.add("North" , bar);

//        create the file ,edit , menu
//        and attach them to menubar

        file = new JMenu("File");
        edit = new JMenu("Edit");
        bar.add(file);
        bar.add(edit);

//        create menu items
        op = new JMenuItem("Open");
        sa = new JMenuItem("Save");
        cl = new JMenuItem("Close");
        cp = new JMenuItem("Copy");
        pt = new JMenuItem("Paste");

        file.add(op);
        file.add(sa);
        file.add(cl);
        file.add(cp);
        file.add(pt);

//        Make close disabled
        cl.setEnabled(false);

//        create print Checkbox and it to the file menu

        pr = new JCheckBoxMenuItem("Print");
        file.add(pr);

//        add a separator (horizontal lines) to file menu
        file.addSeparator();

//        create a submenu and add it to the file menu
        font = new JMenu("Font");
        file.add(font);
//create a menu item
        f1 = new JMenuItem("Arial");
        f2 = new JMenuItem("Times New Roman");


//        add menu items to sub menu

        font.add(f1);
        font.add(f2);

//        attach listener to menu items

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


//    this method is executed when a menu item is clicked

    @Override
    public void actionPerformed(ActionEvent e) {

//        know which menu item is clicked
        if(op.isArmed()) this.openFile();
        if(sa.isArmed()) //this.saveFile();
        if(cl.isArmed()) System.out.println("close is selected");
        if(cp.isArmed()) System.out.println("copy is selected");
        if(pt.isArmed()) System.out.println("paste is selected");
        if(pr.getModel().isSelected()) System.out.println("printing...");
        else System.out.println("printing off...");

        if(f1.isArmed()) System.out.println("Arial font is selected");
        if(f2.isArmed()) System.out.println("Times New Roman is selected");
    }

//    this method is called when File->open is selected

    private void openFile() {

//        create an object to JFileChooser class
        JFileChooser fc = new JFileChooser();
//        display file open dialog box
        int i =fc.showOpenDialog(this);

//        if the user selected a file name then
        if(i==JFileChooser.APPROVE_OPTION){
//            get the selected file into File object
            File file = fc.getSelectedFile();

//            the file name is given by f.getName()
//            File name with path is given by f.getPath()
               String fname = file.getPath();
//               open another frame and pass the fname to it
            OpenFrame of = new OpenFrame(fname);

            of.setSize(400 , 400);
            of.setVisible(true);


 }
    }

    public static void main(String[] args) {
        MyMenu menu1 = new MyMenu();
        menu1.setSize(500 , 400);
        menu1.setVisible(true);
    }
}

//this is ano
class OpenFrame extends JFrame{
    String name;
    public OpenFrame(String name){
        this.name = name;

        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());

//        create a text area and add to content pane
        TextArea ta = new TextArea(22 ,60);
        c.add(ta);

        String str="";
        String str1 ="";

        try{
//            create reader to read from file
            BufferedReader br = new BufferedReader(new FileReader(name));

            while ((str =br.readLine())!=null){
                str1+=str+"\n";

//                display the file content in text area
                ta.setText(str1);


            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}