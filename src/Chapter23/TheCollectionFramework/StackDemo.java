package Chapter23.TheCollectionFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
Program 3: A program to perform different operations on a stack through a menu
 */
public class StackDemo {

    public static void main(String[] args) throws IOException {

        //create an empty stack to contain Integer Object

        Stack<Integer> stack = new Stack<>();

        //take vars

        int choice =0;
        int position , element;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //display the menu as long as user choice < 4

        while (choice < 4){
            System.out.println("STACK OPERATIONS");
            System.out.println("1. Push an element");
            System.out.println("2. Pop an element");
            System.out.println("3. Search an element");
            System.out.println("4 Exit");
            System.out.println("Your choice: ");

            choice = Integer.parseInt(br.readLine());



            switch (choice){
                case 1:
                    System.out.println("Enter element :");
                    element =Integer.parseInt(br.readLine());
                    //int type element is converted into Integer
                    //Object and then pushed into the stack

                    stack.push(element);
                    break;


                case 2://the top-most Integer Object is popped
                Integer obj = stack.pop();
                    System.out.println("Popped=" + obj);

                    break;

                case 3:
                    System.out.println("Which element ? ");
                    element = Integer.parseInt(br.readLine());
                    //int type element is converted into Integer
                    //Object and then searched in then search in the stack

                    position = stack.search(element);

                    if(position == -1){
                        System.out.println("element not found");

                    }else {
                        System.out.println("position" +   position);
                        break;

                    }

                default://come out if user choice is other 1 , 2 or 3
                    return;
            }

            //view the content of stack
            System.out.println("stack content:"  + stack);
        }
    }
}
