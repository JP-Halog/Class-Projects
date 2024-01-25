import java.util.Scanner;
/**
 *Creates a program that displays someone's name, age, and gender,
 *along with calculations for age in minutes and centrues as well as
 *max heart rate based on age and gender.
 *
 *Activity_02
 *@author John Peter Halog - COMP1210 - 06
 *@version 09-04-19
 */
public class AgeStatistics
{
/**
 *Displays someones's age statistics.
 *@param args Command line arguements - not used.
 */
   public static void main(String[]args)
   {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
   //Prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
   
   //Prompt the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
   
   //Prompt the user for their gender:
  System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
   
   //convert age:
      System.out.println("\tYour age in minutes is " 
         + ageInYears * 525600 + " minutes.");
   
      System.out.println("\tYour age in centuries is " 
         + (double) ageInYears / 100 + " centuries.");
   
   //display max heart rate
      System.out.print("Your max heart rate is ");
      if (gender == 1)
      { //calculate female MHR
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
      else
      { //calculate male MHR
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      System.out.println(maxHeartRate + " beats per minute.");
   
   
   
   }
}