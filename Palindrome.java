/*
Ahmad Alkurdy
2/7/2017
a program would realize if the number is palindrom
 */
package palindrome;
import java.util.Scanner;
/**
 *
 * @author ahmad
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       //declaring variable
       String number;
       //prompting the user to enter a number
       System.out.print("Enter a 5-digit integer: ");

        number =input.nextLine();
        //exception handling if the number not 5 digits
       if(number.length()!=5)

       {

           System.out.println("Number is not five digits long.");

           return ;

       }

       for(int i=0;i<2;i++)
       {
           if(number.charAt(i)!= number.charAt(4-i))

           {

               System.out.println("Not a palindrome");

               return;

           }
       }
       System.out.println("Palindrome");

    
    }
    
}
