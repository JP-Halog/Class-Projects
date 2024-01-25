import java.util.Scanner;
/**
*Solves the result of a specified formula.
*
*Project 2
*@author John Peter Halog - COMP1210 - 06
*@version 09-09-19
*/
public class Formula
{
/**
  *Does math.
  *@param args Command line arguements - not used.
  */
   public static void main(String[]args)
   { //Establishes variables.
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      double y = 0;
      double z = 0;
      double result = 0;
      
      //Prints out the formula.
      System.out.println("result = (3x + 10.5) (2y + 7.5) (z + 5.5) / xyz");
      //Prints out variable option and allows user to imput for x.
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();
      //Prints out variable option and allows user to imput for y.
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
      //Prints out variable option and allows user to imput for y.
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();
      if ((x * y * z) == 0)
      { //Prints "result = 0" when z equals 0.
         System.out.println("result = " + 0);
      }
      else
      { //Prints "result = ___" after doing math.
         System.out.println("result = "  
            + (((3 * x + 10.5) * (2 * y + 7.5) * (z + 5.5)) / (z * y * z)));
      }
   }
}