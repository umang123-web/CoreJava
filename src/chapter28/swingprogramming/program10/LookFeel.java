package chapter28.swingprogramming.program10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
* A program that changes the look and feel for the component
*
* */
public class LookFeel extends JFrame implements ItemListener {

    JButton b;

    JCheckBox cb;
    JTextField tb;
    JRadioButton r1 , r2 , r3;
    ButtonGroup bg;
    Container c;

    public LookFeel(){
//        create content pane
        c = this.getContentPane();

        c.setLayout(null);


//        create components
        b= new JButton("Button");
        cb= new JCheckBox("check box");
        tb = new JTextField("Textfield" , 15) ;
        r1 = new JRadioButton("Metal");
        r2 = new JRadioButton("Motif");
        r3 = new JRadioButton("Windows");


//        create a button group object and add radio button to specify
//        that they belong to same group


        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);


//        set location of component in content pane
        b.setBounds(100 , 50 , 75 , 40);
        cb.setBounds(100 , 100 , 100 , 40);
        tb.setBounds(100 ,150 , 100 , 40);
        r1.setBounds(50 , 250 , 100 , 30);
        r2.setBounds(150 , 250 , 100 , 30);
        r3.setBounds(250 , 250 , 100 , 30);



//        add the components
        c.add(b);
        c.add(cb);
        c.add(tb);
        c.add(r1);
        c.add(r2);
        c.add(r3);


//        add item listener
        r1.addItemListener(this);
        r2.addItemListener(this);
        r3.addItemListener(this);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    @Override
    public void itemStateChanged(ItemEvent e) {

//        know which radio button is selected and accordingly
//        change the look and feel

        try {
            if(r1.getModel().isSelected())
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");

            if(r2.getModel().isSelected())
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

            if(r3.getModel().isSelected())
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//change the look and feel in the content pane
            SwingUtilities.updateComponentTreeUI(c);
        } catch (UnsupportedLookAndFeelException ex) {
            throw new RuntimeException(ex);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (InstantiationException ex) {
            throw new RuntimeException(ex);
        } catch (IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        LookFeel lf = new LookFeel();
        lf.setSize(500 , 400);
        lf.setVisible(true);
    }
}
