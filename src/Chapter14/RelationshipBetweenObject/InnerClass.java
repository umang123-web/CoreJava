package Chapter14.RelationshipBetweenObject;
//A program to create the outer class BankAcct and the inner class interest in it

//a innerclass example


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BankAcct{

    private double balance;

    public BankAcct(double balance){
        this.balance = balance;
    }

    //in this method , inner class is created after verifying
    //the authentication of user . r is rate of interest
    //this method accept rate of interest r


    void contact(double r) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter password: " );

        String password = br.readLine();

        if(password.equals("xyz123")){
            Interest in = new Interest(r);
            in.calculateInterest();
        }else{
            System.out.println("sorry  , you are not authorized person");

            return;
        }
    }


    //inner class


    private class Interest{
        private double rate;
        public Interest(double r){
            this.rate = r;
        }

         void calculateInterest() {
           double interest = balance *rate/100;
           balance+=interest;
             System.out.println("updated Balance:"  + balance);
        }
    }
}
public class InnerClass {

    public static void main(String[] args) throws IOException {
        BankAcct bankAcct = new BankAcct(10000);


        bankAcct.contact(9.5);
    }
}
