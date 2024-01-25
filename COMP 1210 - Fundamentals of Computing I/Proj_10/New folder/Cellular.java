/**
* Creates the Cellular class.
* 
* Project 09
* @author Jacob Dewey - COMP 1210 - 004
* @version 011/08/2019
*/

public class Cellular extends WirelessNetwork
{
// Fields
// Instance Varaibles
   protected double time;
   protected double dataLimit;
   
// Constants
/** The cost factor for the WiFi class. */
   public static final double COST_FACTOR = 1.0;

// Constructor
   /**
   * Creates the Cellular object.
   * 
   * @param nameIn - name of the object
   * @param bandwidthIn - the bandwidth
   * @param monthlyFixedCostIn - the fixed cost
   * @param timeIn - the time used
   * @param dataLimitIn the limit of the data

   */
   public Cellular(String nameIn, double bandwidthIn, double monthlyFixedCostIn,
      double timeIn, double dataLimitIn)
   {
      super(nameIn, bandwidthIn, monthlyFixedCostIn);
      setTime(timeIn);
      setDataLimit(dataLimitIn);
   }

// Methods
   /**
   * Gets the time.
   * 
   * @return time - time used.
   */
   public double getTime()
   {
      return time;
   }

   /**
   * Sets the time.
   * 
   * @param timeIn - the time used.
   */
   public void setTime(double timeIn)
   {
      time = timeIn;
   }

   /**
   * Gets the data limit.
   * 
   * @return dataLimit - the limit on data.
   */
   public double getDataLimit()
   {
      return dataLimit;
   }

   /**
   * Sets the data limit.
   * 
   * @param dataLimitIn - the data limit.
   */
   public void setDataLimit(double dataLimitIn)
   {
      dataLimit = dataLimitIn;
   }

   /**
   * Finds the dataUsage.
   * 
   * @return dataUsage.
   */
   public double dataUsage()
   {
      double dataUsage = bandwidth / 8000 * time;
      return dataUsage;
   }
   
   /**
   * Calculates the monthly cost.
   *
   * @return - returns the cost.
   */
   public double monthlyCost()
   {
      if (dataUsage() < dataLimit) {
         return monthlyFixedCost;
      }
      return (monthlyFixedCost + (dataUsage() - dataLimit)
         * Cellular.COST_FACTOR);
   }
   
   /**
   * Creates a string.
   *
   * @return - returns the string.
   */
   public String toString()
   {
      return super.toString() + "\nTime: " + getTime()
         + " seconds\nData Limit: " + getDataLimit()
         + " GB\nData Used: " + dataUsage() + " GB";
   }
}