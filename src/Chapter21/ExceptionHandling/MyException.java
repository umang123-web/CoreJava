package Chapter21.ExceptionHandling;

/*
Program 11: A program to throw a user defined exception
 */
public class MyException extends Exception{

    private static  int accno[]={1001 , 1002 , 1003 , 1004 , 1005};

    private static String name[] = {"Raja rao" , "Rama rao" , "Subha rao" , "Appa rao" , "Laxmi Devi"};

    private static double bal[] = {10000.00 , 12000.00 , 5600.09 , 999.00 , 1100.55};

    public MyException(){

    }



    public MyException(String str){
        super(str);
    }

    public static void main(String[] args) {
        try{
            //display the heading for the table
            System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");

            for(int i=0; i<5; i++){
                System.out.println(accno[i] + "\t" + name[i]  + "\t"  + bal[i]);


                //display own exception if balance < 1000

                if(bal[i] < 1000){
                    MyException me = new MyException("Balance amount is less");
                    throw me;
                }
            }

        } catch (MyException me) {
            me.printStackTrace();

      }
    }
}
