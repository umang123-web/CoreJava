package chapter26.threads;
/*
* Program 16: A java program that creates a fixed thread pool with 2 threads to execute thread
*
* */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{

    private int taskDemo;

    public Task(int taskDemo){
        this.taskDemo = taskDemo;
    }
    @Override
    public void run() {

        for(int i=0; i<=100;i++){
//            find the currently running thread name
            String name = Thread.currentThread().getName();
//            display the thread name that is performing the task
            System.out.println(name + " completed task" + taskDemo + "by" + i + " percent" );

            try{
                Thread.sleep(3000);  //this task is taking 3 seconds
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
public class ThreadPoolDemo{
    public static void main(String[] args) {
//        fixed thread Pool is created with 2 threads
        ExecutorService es = Executors.newFixedThreadPool(2);

        /*
        * number of task are 4
        * create task type array with size 4
        * t[0] to t[3] represents the four tasks
        * */

        Task t[] = new Task[4];

//        execute the 4 task
        for(int i=0; i<4; i++){
//            attach task to the array reference
            t[i] = new Task(i);
//            execute the task show by array reference
            es.execute(t[i]);
        }

        // close the old tasks and do not accept new tasks

        es.shutdown();
    }


}
