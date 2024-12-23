package chapter27.awtgraphicprogramming.program13;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/*
* A program to display an image in the frame and also in the title bar of the frame
*
* */
public class Images extends Frame {

    static Image image;

    public Images(){

//        load an Image into Image Object
        image = Toolkit.getDefaultToolkit().getImage("diamond.gif");

//        wait till the image is loaded into img object

//        for this purpose create MediaTracker
        MediaTracker tracker = new MediaTracker(this);

//        add image to MediaTracker
        tracker.addImage(image , 0);

        try {
//            let the jvm wait till the image is loaded completely
            tracker.waitForID(0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        close the frame
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


    public void paint(Graphics g){
//        display the image in the frame at 50 , 50 pixel
        g.drawImage(image , 50 , 50 , null);
    }

    public static void main(String[] args) {

        Images i = new Images();
//        set the size and title
        i.setSize(400 , 400);
        i.setTitle("My Images");

//        display the same image in the title bar of frame
        i.setIconImage(image);
        i.setVisible(true);
    }
}
