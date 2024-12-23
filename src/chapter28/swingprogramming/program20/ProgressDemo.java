package chapter28.swingprogramming.program20;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;

/*
* A program to create a push button and a progress bar such that it will show the
* progress in percentage
*
* */
public class ProgressDemo extends JFrame {


    JProgressBar bar;

    public ProgressDemo() {
        Container c = this.getContentPane();
//        set flow out manager
        c.setLayout(new FlowLayout());

//        create progress bar with 0 min value
//        and 2000 as max value
        bar = new JProgressBar(0, 2000);

//        set foreground color as green
        bar.setForeground(Color.green);

//        to display percentage of progress
        bar.setStringPainted(true);

//        add the progress bar to content pane
        c.add(bar);


    }

    void increase() throws InterruptedException {
//        repeat the loop in step 10
//        if step size is less slow progress
        for (int i = 0; i < 2000; i += 10) {
//            set the value of the progress bar to i
            bar.setValue(i);

//            delay for 20 second
            Thread.sleep(20);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ProgressDemo demo = new ProgressDemo();
        demo.setSize(500 , 400);
        demo.setVisible(true);

        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        demo.increase();
    }
}
