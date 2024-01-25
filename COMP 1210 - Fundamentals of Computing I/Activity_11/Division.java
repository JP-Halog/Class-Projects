/**
*Division.
*
*Activity_11
*@author John Peter Halog - COMP1210 - 06
*@version 11-18-19
 */

public class Division {
   /**
    * sfsdfssf.
    * @param numerator number to be divided
    * @param denominator number to be divided
    * @return returns the int value of the divide numbers
    */
   public static int intDivide(int numerator, int denominator) {
      try {
         return numerator / denominator;
      } catch (ArithmeticException e) {
         return 0;
      }
   }

   /**
    * sdfsdfsf.
    * @param numerator number to be divided
    * @param denominator number to be divided
    * @return returns teh float value of the divided numbers
    */
   public static float decimalDivide(int numerator, int denominator) {
      if (denominator == 0) {
         throw new IllegalArgumentException("The demoninator "
         + "cannot be zero");
      }
      return (float) numerator / denominator;
   }
}