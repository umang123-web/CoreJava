package chapter26.threads;
/*
*
* Program 1: A program to find the thread used by JVM to execute the statements
* */
public class CurrentThread {
    public static void main(String[] args) {

        System.out.println("Let us find current thread");
        Thread thread = Thread.currentThread();
        System.out.println("current thread =" + Thread.MAX_PRIORITY +"\n" + Thread.MIN_PRIORITY + "\n" + Thread.NORM_PRIORITY);

        System.out.println("current thread is:"   + thread.getName());
        System.out.println("thread main:"  + thread.isAlive());
    }
}
