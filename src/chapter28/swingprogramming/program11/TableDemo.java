package chapter28.swingprogramming.program11;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.util.Vector;

/*
* A program that creates a table with some rows and column
* */
public class TableDemo extends JFrame {

    public TableDemo() {

//    take vector object to represent data of table
        Vector<Vector> data = new Vector<Vector>();

//    take another vector object to represent as row

        Vector<String> row = new Vector<String>();

          row.add("Rama rao");
          row.add("Analyst");
          row.add("22,000.00");


//          add the row to data to the table
        data.add(row);

//        create another row
        row = new Vector<String>();
        row.add("Srinas kumar");
        row.add("programmer");
        row.add("18, 000.50");

        data.add(row);

        row = new Vector<String>();
        row.add("Vinayi Devi");
        row.add("programmer");
        row.add("16,000");


//        add the second row also to data
        data.add(row);


//        create another vector object for column names

        Vector<String>col = new Vector<>();
        col.add("Employee name");
        col.add("Desgination");
        col.add("Salary");

//        do not add column names to data for table

//        create the table
        JTable tab = new JTable(data , col);

//        set the green line border to the table
        tab.setBorder(BorderFactory.createLineBorder(Color.green , 2));
//      set some font

tab.setFont(new Font("Arial" , Font.BOLD , 20));

//set row height

        tab.setRowHeight(30);

//        set grid color to red
        tab.setGridColor(Color.red);

//        get the table header into head
        JTableHeader head = tab.getTableHeader();
//        create a content pane

        Container c= this.getContentPane();

//        set the border layout to the content pane
        c.setLayout(new BorderLayout());

//        add head of the table at top and remaining table below the top
        c.add("North" , head);
        c.add("Center" , tab);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        TableDemo demo = new TableDemo();
        demo.setSize(400 , 400);
        demo.setVisible(true);
        demo.setTitle("Table");
    }

}
