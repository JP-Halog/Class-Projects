import java.text.DecimalFormat;

/**
* The WirelessNetwork class.
* 
* 
* Proj_09
* @author John Peter Halog - COMP1210-06
* @version 11-12-19
*/

public abstract class WirelessNetwork
{
// Fields
   protected String name;
   protected double bandwidth;
   protected double monthlyFixedCost;
   
   protected static int count = 0;

// Constructor
   /**
   * Creates the WirelessNetwork.
   * 
   * @param nameIn - the name of the object.
   * @param bandwidthIn - the bandwidth of the object.
   * @param monthlyFixedCostIn - the fixed cost.
   */
   public WirelessNetwork(String nameIn, double bandwidthIn,
      double monthlyFixedCostIn) 
   {
      setName(nameIn);
      setBandwidth(bandwidthIn);
      setMonthlyFixedCost(monthlyFixedCostIn);
      count++;
   }

// Methods
   /**
   * Gets the name.
   * 
   * @return name - returns the name.
   */
   public String getName()
   {
      return name;
   }
   /**
   * Sets the name.
   * 
   * @param nameIn - the name
   */
   public void setName(String nameIn)
   {
      name = nameIn;
   }
   /**
   * Gets the bandwidth.
   * 
   * @return bandwidth - the bandwidth
   */
   public double getBandwidth()
   {
      return bandwidth;
   }
   /**
   * Sets the bandwidth.
   * 
   * @param bandwidthIn - the bandwidth
   */
   public void setBandwidth(double bandwidthIn)
   {
      bandwidth = bandwidthIn;
   }
   /**
   * Gets the fixed monthly cost.
   * 
   * @return monthlyFixedCost - the fixed cost per month
   */
   public double getMonthlyFixedCost()
   {
      return monthlyFixedCost;
   }
   /**
   * Sets the fixed cost.
   * 
   * @param monthlyFixedCostIn - the monthly fixed cost
   */
   public void setMonthlyFixedCost(double monthlyFixedCostIn)
   {
      monthlyFixedCost = monthlyFixedCostIn;
   }
   /**
   * Gets the object count.
   * 
   * @return count - # of objects.
   */
   public static int getCount()
   {
      return count;
   }
   /**
   * Resets the count.
   */
   public static void resetCount()
   {
      count = 0;
   }
   /**
   * string result.
   * 
   * @return - returns a string
   */
   public String toString()
   {
      DecimalFormat dt = new DecimalFormat("#,###.00");
      return name + " (" + this.getClass() + ") Cost: $" 
         + dt.format(monthlyCost()) + "\nBandwidth: "
         + getBandwidth() + " Mbps";
   }
   /**
   * Monthly cost.
   * 
   * @return - returns a montly cost.
   */
   public abstract double monthlyCost();
}