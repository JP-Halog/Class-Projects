import java.util.Scanner;
import java.util.ArrayList;
/**
*Holds integer values for operations.
*
*Activity_05_2
*@author John Peter Halog - COMP1210 - 06
*@version 09-30-19
*/
public class NumberOpsDriver {

   /**
    * Reads a set of positive numbers from the user until 0 is entered.
	 * Gives odds under and powers of 2 under for each number.
	 *
    * @param args Command line arguements - not used.
    */
   public static void main(String[] args) {
   	
      String input = "";
      Scanner in = new Scanner(System.in);
      
      ArrayList<NumberOperations> numOpsList 
         = new ArrayList<NumberOperations>();
      
      System.out.println("Enter a list of positive integers separated "
         + "with a space followed by 0: ");
      int userInput = in.nextInt();
      while (userInput != 0) 
      {
         NumberOperations enter = new NumberOperations(userInput);
         numOpsList.add(enter);
         userInput = in.nextInt();
      }
   		   
      int i = 0;
      while (i < numOpsList.size()) 
      {
         NumberOperations num = numOpsList.get(i);
         System.out.println("For: " + num);
         System.out.println("  Odds under:\t" + num.oddsUnder());
         System.out.println("  Powers of 2 under:\t" + num.powersTwoUnder());
         i++;
      }
   }
}