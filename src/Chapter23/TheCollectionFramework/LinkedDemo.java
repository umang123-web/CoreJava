package Chapter23.TheCollectionFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

/*

Program 4: A program that shows the use of Linkedlist class
 */
public class LinkedDemo {

    public static void main(String[] args) throws IOException {

        LinkedList<String> link = new LinkedList<>();
        link.add("America");
        link.add("India");
        link.add("Japan");

        //display the element in the linkedlist
        System.out.println("List ="  + link);


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String element;
        int choice =0;
        int positon;


        while (choice < 4){
            System.out.println("\n LINKEDLIST OPERATIONS");
            System.out.println("1 Add an Element");
            System.out.println("2 Remove an Element");
            System.out.println("3 Change an Element");

            System.out.println("4 exit");


            System.out.println("Your choice: " );


             choice = Integer.parseInt(br.readLine());

             //perform a task depending on user choice

            switch (choice){
                case 1:
                    System.out.println("Enter a element");
                    element = br.readLine();
                    System.out.println("At what position?");
                    positon = Integer.parseInt(br.readLine());
                    link.add(positon -1 , element);
                    break;

                case 2:
                        System.out.println("Enter  position");
                        positon = Integer.parseInt(br.readLine());
                        link.remove(positon -1);
                        break;

                case 3:
                    System.out.println("Enter a position");
                    positon = Integer.parseInt(br.readLine());
                    System.out.println("Enter a positon ");
                    element = br.readLine();
                    link.set(positon -1 , element);
                    break;

                    default :return;
            }

            //use Iterator to retreive the element
            System.out.println("LIST = ");
            Iterator it = link.iterator();
            while (it.hasNext()){
                System.out.println(it.next());

            }
        }
    }
}
