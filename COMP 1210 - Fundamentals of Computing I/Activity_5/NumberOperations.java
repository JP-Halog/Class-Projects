/**
*Holds integer values for operations.
*
*Activity_05_1
*@author John Peter Halog - COMP1210 - 06
*@version 09-30-19
*/
public class NumberOperations
{
  /**
   *Holds integer values and provides methods to
   *perform operations on those values.
   *@param args Command line arguements - not used.
   */
   
   private int number; // establishes number
      
   /**
   * Creates a number list..
   * @param numberIn is the label name entered by the user.
   */
   public NumberOperations(int numberIn)
   {
      number = numberIn;
   }
   
   /**
   * Returns the value.
   * @return returns the value.
   */
   public int getValue()
   {
      return number; // placeholder return
   }
      
   /**
   * Returns the value.
   * @return returns the value.
   */
   public String oddsUnder()
   /** Takes no parameters; returs a String */
   {
      String output = "";
      int i = 0;
      while (i < number)
      {
         if (i % 2 != 0)
         {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   /**
   * Returns the value.
   * @return returns the value.
   */
   public String powersTwoUnder()
   {  
      String output = "";
      int powers = 1;
      while (powers < number)
      {
         output += powers + "\t";
         powers = powers * 2;
      }   
      return output;
   }
   
   /**
   * Returns the value.
   * @param compareNumber is number.
   * @return returns the value.
   */
   public int isGreater(int compareNumber)
   /**nTakes an int parameter called compareNumber; returns an int */
   {
      if (number > compareNumber)
      {
         return 1;
      }
      else if (number < compareNumber)
      {
         return -1;
      }
      else
      {
         return 0;
      }
   }
   /**
   * Returns the value.
   * @return returns the value.
   */
   public String toString()
   {
      return number + "";
   }
}