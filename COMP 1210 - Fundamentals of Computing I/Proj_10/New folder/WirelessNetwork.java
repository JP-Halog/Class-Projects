import java.text.DecimalFormat;

/**
* Creates the WirelessNetwork class.
* 
* 
* Project 09
* @author Jacob Dewey - COMP 1210 - 004
* @version 11/08/2019
*/

public abstract class WirelessNetwork implements Comparable<WirelessNetwork>
{
// Fields
   protected String name;
   protected double bandwidth;
   protected double monthlyFixedCost;
   
   protected static int objectCount = 0;

// Constructor
   /**
   * Creates the WirelessNetwork object.
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
      objectCount++;
   }

// Methods
   /**
   * Gets the name of the object.
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
   * @return objectCount - # of objects.
   */
   public static int getCount()
   {
      return objectCount;
   }
   
   /**
   * Resets the count to zero.
   */
   public static void resetCount()
   {
      objectCount = 0;
   }
   
   /**
   * Creates the string result.
   * 
   * @return - returns a string
   */
   public String toString()
   {
      DecimalFormat ft = new DecimalFormat("#,###.00");
      return name + " (" + this.getClass() + ") Cost: $" 
         + ft.format(monthlyCost()) + "\nBandwidth: "
         + getBandwidth() + " Mbps";
   }
   
   /**
   * Monthly cost.
   * 
   * @return - returns a montly cost.
   */
   public abstract double monthlyCost();
   
   /**
   * Compares networks.
   * 
   * @param networkIn - the network.
   * @return - returns an int.
   */
   public int compareTo(WirelessNetwork networkIn)
   {
      String networkName = "";
      String networkNameIn = "";
      String[] names = name.split("\\s");
      String[] namesIn = networkIn.name.split("\\s");
      if (names.length > 1) {
         networkName = names [1];
         networkNameIn = namesIn[1];
         return 
            networkName.toLowerCase().compareTo(networkNameIn.toLowerCase());
      }
      else { 
         return name.toLowerCase().compareTo(networkIn.name.toLowerCase());
      }
   }
}