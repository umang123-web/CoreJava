package Chapter23.TheCollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

/*
Program 7: A program to create a queue with Integer Object
 */
public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        //store integer from 1 to 5

        //these integers are converted into integer object and then stored

        for(int i=1; i<5; i++){
            q.offer(i);
        }

        //retrieve integers from queue
        System.out.println("The queue is:  ");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }

}
