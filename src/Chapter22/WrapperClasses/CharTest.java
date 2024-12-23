package Chapter22.WrapperClasses;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Program 1 : A program that accepts the character from the keyboard and display its type
 */
public class CharTest {

    public static void main(String[] args) throws IOException {
        char ch;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //executed repeatedly
        while(true){
            System.out.println("Enter a Character: ");
            ch = (char) br.read();

            //test and display the type of character
            System.out.println("You entered: ");
            if(Character.isDigit(ch)){
                System.out.println("a digit");

            }else if(Character.isUpperCase(ch)){
                System.out.println("a uppercase letter");
            }else if(Character.isLowerCase(ch)){
                System.out.println("a lowercase letter");

            }else if(Character.isWhitespace(ch)){
                System.out.println("a whitespace bar");
            }else if(Character.isSpaceChar(ch)){
                System.out.println("a spacebar character");
                return;
            }


            else System.out.println("Sorry I don't know that");
            br.skip(2); //skip \n code from br
        }
    }

}
