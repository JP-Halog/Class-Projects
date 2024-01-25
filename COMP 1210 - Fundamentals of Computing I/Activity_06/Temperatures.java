import java.util.ArrayList;
/**
*Holds a set of integer values representing daily temperatures.
*
*Activity_06_01
*@author John Peter Halog - COMP1210 - 06
*@version 10-08-19
*/  

public class Temperatures
{ //Instance Variable
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();

   /**
   * Takes ArrayList of int temp values.
   * @param temperaturesIn is the array.
   */

   public Temperatures(ArrayList<Integer> temperaturesIn)
   {  
      temperatures = temperaturesIn;
   }
   
   //Methods
   /**
   * Returns the low temp.
   * @return returns the low temp.
   */
   public int getLowTemp()
   {  //
      int low;
      if (temperatures.isEmpty())
      {
         low = 0;
      }
      else
      {
         low = temperatures.get(0);
         for (int i = 0; i < temperatures.size(); i++)
         {
            if (temperatures.get(i) < low)
            {
               low = temperatures.get(i);
             
            }
         }
      
      }
      return low;
   }
   
   /**
   * Returns the high temp.
   * @return returns the hight temp.
   */
   public int getHighTemp()
   {
      int high;
      if (temperatures.isEmpty())
      {
         high = 0;
      }
      else
      {
         high = temperatures.get(0);
         for (Integer currentTemp : temperatures)
         {
            if (currentTemp > high)
            {
               high = currentTemp;
            }
         }
      }
      return high;
   }
   
   /**
   * Returns the lower min.
   * @param lowIn is the lower min.
   * @return returns the lower min.
   */
   public int lowerMinimum(int lowIn)
   {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
   /**
   * Returns the higher max.
   * @param highIn is the higher max
   * @return returns the higher max.
   */
   public int higherMaximum(int highIn)
   {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   /**
   * Returns the string for temp values.
   * @return returns a string for temp values.
   */
   public String toString()
   {
   
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}