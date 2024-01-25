import java.util.ArrayList;
import java.util.Scanner;
/**
*Allows users to interact with the Temperatures class.
*
*Activity_06_02
*@author John Peter Halog - COMP1210 - 06
*@version 10-08-19
*/  
public class TemperatureInfo
{
/** 
* Outputs info from temperatures class.
* @param args Command line(not used).
*/
   public static void main(String[] args)
   { //Instances
      ArrayList<Integer> tempList = new ArrayList<Integer>();
      Scanner userInput = new Scanner(System.in);
      
      //Method  
      String tempInput = "";
      do 
      { //Will repeat the do-while statement as long as its not empty.
         System.out.print("Enter a temperature"
            + " (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals(""))
         {
            tempList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
      
      Temperatures temps = new Temperatures(tempList);
      
      char choice = 'E';
      do
      {
         System.out.print("Enter choice - [L]ow temp, [H]igh temp,"
            + " [P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) 
         {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
               
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
               
            case 'P':
               System.out.println(temps);
               break;
               
            case 'E':
               System.out.println("\tDone");
               break;
               
            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
            
   } 

}