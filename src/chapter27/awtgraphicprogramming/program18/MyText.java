package chapter27.awtgraphicprogramming.program18;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
* A program to create two labels and two text fields for entering name and passwords.
* The password typed by the user in the text field is hidden
*
* */
public class MyText  extends  Frame implements ActionListener {

    private TextField name , password;

    public MyText(){
//        set layout to flow layout
            setLayout(new FlowLayout());

//            create 2 labels
        Label n = new Label("name: " , Label.LEFT);
        Label p = new Label("password: " , Label.LEFT);

//        create text field for name and password
        name = new TextField(20);
        password = new TextField(20);
//        hide the password by
        password.setEchoChar('*');

//        use background , foreground colors and font for name textfield
        name.setBackground(Color.yellow);
        name.setForeground(Color.red);
        Font f = new Font("Arial" , Font.PLAIN , 25);


//        add the labels and textfields to frame

        add(n);
        add(name);
        add(p);
        add(password);

//        add action listener to the text field
        name.addActionListener(this);
        password.addActionListener(this);


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }

//    this method is executed when enter is clicked .
//    display the text entered into the text fields

    @Override
    public void actionPerformed(ActionEvent e) {

//        create Graphics class object
        Graphics g =this.getGraphics();

        g.drawString("Name:" + name.getText() , 10 ,200);
        g.drawString("password:" + password.getText() , 10 , 240);
    }

    public static void main(String[] args) {
        MyText mt = new MyText();
        mt.setSize(400 ,400);
        mt.setVisible(true);
        mt.setTitle("My Text");
    }
}
