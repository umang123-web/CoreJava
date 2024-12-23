package chapter27.awtgraphicprogramming.program22;

import chapter27.awtgraphicprogramming.program12.Fonts;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
* A program to trap the key code and key name typed by the user on keyboard and display
* them in a text area
*
* */
public class Keys extends Frame implements KeyListener {

    TextArea ta;
    String message="";

    public Keys(){

        setLayout(new FlowLayout());

//        create a text area to display the key code
        ta = new TextArea(5 , 25);
//        see some font and foreground color to text area

        Font f = new Font("sanserif" , Font.BOLD , 25);
        ta.setFont(f);
        ta.setForeground(Color.red);


        add(ta);
//        add key listener to text area

        ta.addKeyListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

//        get the code of the key pressed
        int keycode = e.getKeyCode();
        String keyname = e.getKeyText(keycode);
        message+="\n key pressed:" + keyname;

//        display the key code and key name in text area
        ta.setText(message);
        message="";
    }

    @Override
    public void keyReleased(KeyEvent e) {

//        get the key code released
        int keycode = e.getKeyCode();
        message+="\n key code:" + keycode;
//      get the key name from the code
        String keyname = e.getKeyText(keycode);
        message+="\nkey released:" + keyname;

//        display key code and key name in text area
        ta.setText(message);
        message="";
    }

    public static void main(String[] args) {
        Keys k = new Keys();
        k.setSize(400 , 400);
        k.setVisible(true);

    }
}
