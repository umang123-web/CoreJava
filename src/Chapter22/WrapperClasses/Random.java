package Chapter22.WrapperClasses;

import Chapter18.AbstractClasses.Maruti;

/*
Program 4: A program that generates random numbers repeatedly between 0 and 10. You also need to ensure that
if the generated number is 0 then program get terminated
 */
public class Random {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Random no. between 0 and 10");

        /*
        random() return double between 0 and 1.But we want that no. as Integer and
        between 0 and 10. so multiply with 10 and then convert into int
         */
        while (true){
            double d = 10* Math.random();
            int i = (int)d;

            System.out.println(i);
            //Let the execution wait till 2000 millisecond = 2second

            Thread.sleep(2000);

            if(i ==0){
                System.exit(0);
            }
        }
    }
}
