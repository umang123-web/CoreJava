package Chapter23.TheCollectionFramework;

import java.util.StringTokenizer;

/*
Program 12 : A program that shows the use of StringTokenizer
 */
public class STDDemo {

    public static void main(String[] args) {
        //take a String

        String str ="He is a gentle man";
        //break into token at spaces . Here delimeter is a spaced

        StringTokenizer st = new StringTokenizer(str , " ");

        //retrieve token from st and display

        System.out.println("The tokens are");

        while (st.hasMoreTokens()){

          String one = st.nextToken();
            System.out.println(one);
        }
    }
}
