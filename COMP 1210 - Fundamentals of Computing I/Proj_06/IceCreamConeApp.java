import java.util.Scanner;
/**
*Reads values for label, radius, and height.
*
*Proj_04_02
*@author John Peter Halog - COMP1210 - 06
*@version 09-18-19
*/

public class IceCreamConeApp
{  
/** Outputs info from a pyramid.
*
* @param args Command line(not used).
*/
   public static void main(String[] args)
   {
      double height = 0;
      double radius = 0;
      String label = "";
      Scanner userInput = new Scanner(System.in);
      
      // Stuff
      System.out.println("Enter label, radius,"
         + " and height for an ice cream cone.");
      System.out.print("\tlabel: ");
      label = userInput.nextLine();
      
      // Enter radius
      System.out.print("\tradius: ");
      radius = Double.parseDouble(userInput.nextLine());
      if (radius <= 0)
      {
         System.out.println("Error: radius must be greater than 0.");
         return;
      }
       // Enter height
      System.out.print("\theight: ");
      height = Double.parseDouble(userInput.nextLine());
      if (height <= 0)
      {
         System.out.println("Error: height must be greater than 0.");
         return;
      }
   
      // Instance methods
      IceCreamCone obj = new IceCreamCone(label, radius, height);
      System.out.println();
      System.out.println(obj.toString());
      
   }

   
   
  

   
}