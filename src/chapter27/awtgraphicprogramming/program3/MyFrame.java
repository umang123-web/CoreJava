package chapter27.awtgraphicprogramming.program3;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
* Program 3: A program which first creates a frame and then closes it on clicking
* the close button
* */
public class MyFrame {

    public static void main(String[] args) {

        Frame frame = new Frame("My AWT GUI");
        frame.setSize(400 , 400);
        frame.setVisible(true);
        frame.addWindowListener(new MYClass());

    }


}

class MYClass implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
