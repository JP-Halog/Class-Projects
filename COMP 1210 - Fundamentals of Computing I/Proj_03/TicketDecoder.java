import java.util.Scanner;
import java.text.DecimalFormat;

/**
*Distributes tickets to different stuff.
*
*Proj_03_2
*@author John Peter Halog - COMP1210 - 06
*@version 09-16-19
*/

public class TicketDecoder
{
/**
   *Does math.
   *@param args Command line arguements - not used.
   */
   public static void main(String[]args)
   { //Establishes variables.
      Scanner userInput = new Scanner(System.in);
      double numPrice = 0;
      double numDiscount = 0;
      int numSection = 0;
      int numRow = 0;
      int numSeat = 0;
      int infoLength = 0;
      String game = "";
      
      
      System.out.print("Enter your ticket code: ");
      String ticket = userInput.nextLine();
      System.out.println();
      infoLength = ticket.length();
      if (infoLength < 26)
      {
         System.out.println("Invalid Ticket Code.");
         System.out.println("Ticket code must have at"
            + " least 26 characters.");
      }
      else 
      {
         ticket = ticket.trim();
         game = ticket.substring(26, ticket.length());
         System.out.println("Game: " + game
            + "   Date: " + ticket.substring(11, 13) 
            + "/" + ticket.substring(13, 15) 
            + "/" + ticket.substring(15, 19)
            + "   Time: " + ticket.substring(7, 9)
            + ":" + ticket.substring(9, 11));
      }
   
   }
}
  
