package chapter28.swingprogramming.program24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/*
* A program to create a text area and display the mouse event when the button on the mouse is
* clicked, when the mouse is moved , etc is done by the user
*
* */
public class MouseEventDemo extends JFrame implements MouseListener , MouseMotionListener {

    String str="";
    JTextArea ta;
    Container c;
    int x, y;

    public MouseEventDemo(){
        c = getContentPane();
        c.setLayout(new FlowLayout());
//        create a text area and set some font to it
        ta = new JTextArea("Click the mouse or move it" , 5 , 20);

        ta.setFont(new Font("Arial" , Font.BOLD , 30));
//        add text area to content pane
        c.add(ta);
//        add mouse listener , mouse motion listener to text area
        ta.addMouseListener(this);
        ta.addMouseMotionListener(this);

    }


    @Override
    public void mouseClicked(MouseEvent e) {

//        know which button of mouse is clicked

        int i=e.getButton();
        if(i==1)
            str+="clicked button left";
        else if(i==2)
            str+="clicked button middle";
            else if(i==3)
                str+="clicked button right";

            this.display();
        }


    @Override
    public void mousePressed(MouseEvent e) {

    x= e.getX();
    y=e.getY();
    str+="Mouse pressed:" + x+"\t" +y;
    this.display();

    }

    @Override
    public void mouseReleased(MouseEvent e) {

        x = e.getX();
        y=e.getY();
        str+="Mouse released at:" + x + "\t" + y;
        this.display();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

        str+="Mouse enetered";
        this.display();

    }

    @Override
    public void mouseExited(MouseEvent e) {

        str+="Mouse exited";
        this.display();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

        x=e.getX();
        y=e.getY();
        str+="Mouse dragged:" + x + "\t" + y;
    }

    @Override
    public void mouseMoved(MouseEvent e) {

        x = e.getX();
        y=e.getY();
        str+="Mouse moved at" + x + "\t" + y;

        this.display();

    }

    public void display(){
        ta.setText(str);
        str="";

    }

    public static void main(String[] args) {
        MouseEventDemo demo = new MouseEventDemo();
        demo.setSize(400 , 400);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
