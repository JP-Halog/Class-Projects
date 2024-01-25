/**
* Creates the LTE class.
* 
* Project 09
* @author - Jacob Dewey - COMP 1210 - 004
* @version 11/08/2019
*/

public class LTE extends Cellular
{
// Field
/** Constant for the cost factor. */
   public static final double COST_FACTOR = 4.0;

// Constructor
   /**
   * Creates the LTE object.
   * 
   * @param nameIn - the name of the object
   * @param bandwidthIn - the bandwidth
   * @param monthlyFixedCostIn - the fixed cost
   * @param timeIn - the time used
   * @param dataLimitIn the limit of the data
   */
   public LTE(String nameIn, double bandwidthIn, double monthlyFixedCostIn,
      double timeIn, double dataLimitIn)
   {
      super(nameIn, bandwidthIn, monthlyFixedCostIn, timeIn, dataLimitIn);
   }

// Methods
   /**
   * Determines the cost.
   * 
   * @return - returns the fixed cost per month.
   */
   public double monthlyCost()
   {
      if (dataUsage() > dataLimit) {
         return (monthlyFixedCost + ((dataUsage() - dataLimit) 
            * LTE.COST_FACTOR * 2));
      }
      return monthlyFixedCost;
   }
}