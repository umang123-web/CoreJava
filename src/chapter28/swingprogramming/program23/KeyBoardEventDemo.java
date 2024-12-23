package chapter28.swingprogramming.program23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
* A program to trap a key which is pressed on the keyboard and display its name in the text area. In this
* program we consider some keys only for demonstration purpose.
*
* */
public class KeyBoardEventDemo  extends JFrame implements KeyListener {

    Container c;
    JTextArea ta;
    String str="";

    public KeyBoardEventDemo(){
//        create content pane
        c=getContentPane();
//      create a text area and set some font to it

ta = new JTextArea("Press a key");
ta.setFont(new Font("Arial" , Font.BOLD , 30));

//add text area to content pane
        c.add(ta);
//        add key listener to text area
        ta.addKeyListener(this);

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

//        get the key code of the key pressed on keyboard
        int keycode =e.getKeyCode();
//        find which key is pressed
        if(keycode == KeyEvent.VK_F1) str+="F1 key ";
        if(keycode == KeyEvent.VK_F2) str+="F2 key";
        if(keycode == KeyEvent.VK_F3) str+="F3 key";
        if(keycode == KeyEvent.VK_PAGE_UP) str+="key up";
        if(keycode == KeyEvent.VK_PAGE_DOWN) str+="page down";
        if(keycode == KeyEvent.VK_ALT)str+="Alt";
        if(keycode == KeyEvent.VK_HOME) str+="home";
        if(keycode == KeyEvent.VK_END) str+="end";

        ta.setText(str);
        str="";
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static void main(String[] args) {
        KeyBoardEventDemo demo = new KeyBoardEventDemo();
        demo.setSize(500 , 500);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
