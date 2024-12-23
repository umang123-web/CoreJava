package chapter28.swingprogramming.program14;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import java.awt.*;

/*
* A program to create a Jtree with a root node and other nodes spanning from root node
*
*
* */
public class JTreeDemo extends JFrame implements TreeSelectionListener {


    DefaultMutableTreeNode root , dir1 , dir2 , file1 , file2 , file3;

    JTree tree;
    Container c;
    String message;

    JTextArea ta;

    public JTreeDemo(){

//        create content pane c

        c=this.getContentPane();

        c.setLayout(new BorderLayout());

//        create root node

        root = new DefaultMutableTreeNode("C:\\");

//        create other nodes
        dir1 = new DefaultMutableTreeNode("Java Programs");
        dir2 = new DefaultMutableTreeNode("Other programs");
        file1 = new DefaultMutableTreeNode("JButtonDemo.java");
        file2 = new DefaultMutableTreeNode("JCheckBoxDemo.java");
        file3 = new DefaultMutableTreeNode("xyz.c");


//        add dir1 to root node

        root.add(dir1);

//        add other nodes to dir1
        dir1.add(file1);
        dir1.add(file2);
        dir1.add(dir2);

//        add file3 as a node in dir2

        dir2.add(file3);

//        create the tree from root node

        tree = new JTree(root);

//        add the tree to container

        c.add("North" , tree);
//        create 3 empty labels and add to container
        ta = new JTextArea();
        c.add("South" , ta);

        tree.addTreeSelectionListener(this);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    @Override
    public void valueChanged(TreeSelectionEvent e) {

//         let us find out the selected item path

        TreePath tp =e.getNewLeadSelectionPath();
        message+="\n path of selected component=" + tp;

        Object comp = tp.getLastPathComponent();
        message+="\n component selected=" + comp;

        int n =tp.getPathCount();
        message+="\n level of component=" + n;

//        send the user selection to the label
        ta.setText(message);
        message="";

    }

    public static void main(String[] args) {
        JTreeDemo demo = new JTreeDemo();
        demo.setSize(400 , 300);
        demo.setVisible(true);
    }
}
