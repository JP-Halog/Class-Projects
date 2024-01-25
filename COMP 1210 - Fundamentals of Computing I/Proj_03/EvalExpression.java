import java.util.Scanner;
import java.text.DecimalFormat;

/**
*Calculates a mathmatical expression.
*
*Proj_03_1
*@author John Peter Halog - COMP1210 - 06
*@version 09-16-19
*/

public class EvalExpression
{
/**
   *Does math.
   *@param args Command line arguements - not used.
   */
   public static void main(String[]args)
   { //Establishes variables.
      Scanner userInput = new Scanner(System.in);
      Double x = 0.0;
      Double formula = 0.0;
      int length = 0;
      int decimal = 0;
      int numRight = 0;
      int numLeft = 0;
      DecimalFormat df = new DecimalFormat("#,##0.0###");
   
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      //Does the whole formula after plugging in for x.
      formula = ((12.4 * Math.pow(x, 6))
         - (1.2 * Math.pow(x, 3)) + Math.sqrt(Math.abs((2.6 * Math.pow(x, 5))
         - (6.8 * x) + 7)))
         / (Math.pow(x, 4) + 9);
      
      length = formula.toString().length();
      decimal = formula.toString().indexOf(".");
      numRight = (length - decimal - 1);
      numLeft = decimal;
      
      //Prints out results.
      System.out.println("Result: " + formula);
      System.out.println("# of characters to left of decimal point: " 
         + numLeft);
      System.out.println("# of characters to right of decimal point: " 
         + numRight);
      System.out.println("Formatted Result: " 
                        + df.format(formula));
      
      
      
      
   
   }
}
  
