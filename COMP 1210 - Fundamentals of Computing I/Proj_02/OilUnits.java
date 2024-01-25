import java.util.Scanner;

/**
*Oil readings readings to different measures.
*This was irritating to figure out.
*
*Project 2
*@author John Peter Halog - COMP1210 - 06
*@version 09-09-19
*/

public class OilUnits
{
/**
  *Does conversions for a lazer.
  *@param args Command line arguements - not used.
  */
   public static void main(String[]args)
   { //Establishes variables.
      Scanner userInput = new Scanner(System.in);
      int barrels = 5376;
      int gallons = 128;
      int quarts = 32;
      int ounces = 0;
      int rawOil = 0;
      
      System.out.print("Enter the amount of oil in ounces: ");
      rawOil = userInput.nextInt();
      
      if (rawOil > 1000000000)
      { //Prints measurement error message.
         System.out.println("Amount must not exceed 1,000,000,000.");
      }
      else
      { //Prints out measurement by different stuff.
         System.out.println("Oil amount in units:");
      //Calculates and prints miles.
         barrels = rawOil / 63360;
         System.out.println("\tBarrels " + barrels);
      //Calculates and prints yards.
         gallons = (rawOil % 63360) / 36;
         System.out.println("\tGallons: " + gallons);
      //Calculates and prints feet.
         quarts = rawOil % 36 / 12;
         System.out.println("\tQuarts: " + quarts);
      //Calculates and prints inches.
         ounces = rawOil % 12 / 1;
         System.out.println("\tOunces: " + ounces);
      //Skips a line.
         System.out.println();
      //Prints results
         System.out.print(rawOil);
         System.out.print(" oz = ");
         System.out.print(barrels + " bl * ");
         System.out.print(gallons + " yd, ");
         System.out.print(quarts + " ft, ");
         System.out.println(ounces + " in");
      }
   }
}