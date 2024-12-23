package chapter26.threads;

import java.awt.*;

/*
* Program 15: A program to understand how threads can be used to animate
* the things we animate a banner text
*
* */
public class Banner extends Frame implements  Runnable {

    String str = "DREAM TECH PUBLICATIONS";

    public Banner(){
        setLayout(null); //dont set layout manager
        setBackground(Color.cyan);
        setForeground(Color.red);
    }

    public void paint(Graphics g){
//        set a font and display the banner string
        Font f =new Font("Courier" , Font.BOLD , 40);
        g.setFont(f);
        g.drawString(str , 10, 100);
    }

    @Override
    public void run() {
        for(;;){  //move banner continously
            repaint();

            try{
                Thread.sleep(400);  //give a gap of 400 millisecond between each movement

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            char ch = str.charAt(0); //extract first char from string

            str = str.substring( 1 , str.length()); //add to str second
            //char till end
            str = str+ch; //attach first char at the end of the str
        }
    }

    public static void main(String[] args) {
        Banner b = new Banner();
        b.setSize(400 , 400);
        b.setTitle("My Banner");
        b.setVisible(true);
//        create Thread and run it
        Thread thread = new Thread(b);
        thread.start();
    }
}
