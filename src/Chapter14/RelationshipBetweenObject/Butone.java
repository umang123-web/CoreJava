package Chapter14.RelationshipBetweenObject;


//Annaymous inner class example. This is a class whose no name and which is created only one object

//A program to create a push button and add it to a frame

// annaymous inner class example

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Butone extends Frame {

    public Butone() {
        Button button = new Button("oK");
        //add push button to frame
        add(button);

        //myClass is implementation class of Actionlistener interface
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        //create a frame by creating But class object

        Butone obj = new Butone();
        //set the size of frame to width:400px  and height 300px;

        obj.setSize(400 , 300);
        //display the frame
        obj.setVisible(true);
    }




}

