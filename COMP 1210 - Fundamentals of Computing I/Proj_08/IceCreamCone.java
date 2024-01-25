import java.text.DecimalFormat;
/**
*Constructor of IceCreamCone.
*
*Proj_06_01
*@author John Peter Halog - COMP1210 - 06
*@version 10-15-19
*/

public class IceCreamCone
{  // Instance variables (field)
   private String label = "";
   private double radius = 0;
   private double height = 0;
   private static int count = 0;
   
   // Constructor
   /**
   * Creates a ice cream cone list.
   * @param labelIn is the label name entered by the user.
   * @param radiusIn is the radius given by the user.
   * @param heightIn is the height given by the user.
   */
   public IceCreamCone(String labelIn, double radiusIn, double heightIn)
   {
      setLabel(labelIn);
      setRadius(radiusIn);
      setHeight(heightIn);       
      count++;          
   }
   
   // Methods
   /**
   * Returns the label.
   * @return returns the label.
   */
   public String getLabel()
   {
      return label;
   }
   /**
   * Returns the boolean if label is set.
   * @param labelIn is the label.
   * @return returns boolean.
   */
   public boolean setLabel(String labelIn)
   {
      boolean isSet = false;
      if (labelIn != null)
      {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }
   /**
   * Returns the radius.
   * @return returns the radius.
   */
   public double getRadius()
   {
      return radius;
   }
   /**
   * Returns the boolean if radius is set.
   * @param radiusIn is the radius.
   * @return returns the boolean value.
   */
   public boolean setRadius(double radiusIn)
   {  
      if (radiusIn > 0)
      {
         radius = radiusIn;
         return true;
      }
      else
      {
         return false;
      }
   }
   /**
   * Returns the height.
   * @return returns the height.
   */
   public double getHeight()
   {
      return height;
   }
   /**
   * Returns the boolean if height is set.
   * @param heightIn is the height length.
   * @return returns the boolean is set.
   */
   public boolean setHeight(double heightIn)
   {
      if (heightIn > 0)
      {
         height = heightIn;
         return true;
      }
      else
      {
         return false;
      }
   }
   /**
   * Returns the surface area.
   * @return returns the surface area.
   */
   public double surfaceArea()
   { // Math for surface area of pyramid
      double surfaceArea = ((Math.PI * radius)
         * Math.sqrt(Math.pow(height, 2) 
         + Math.pow(radius, 2)))
         + ((Math.PI * 2 * Math.pow(radius, 2)));
      return surfaceArea;
      
   }
   /**
   * Returns the volume.
   * @return returns the volume.
   */
   public double volume()
   { // Math for volume of IceCreamCone.
      double volume = ((Math.PI * height
         * Math.pow(radius, 2)) / 3) 
         + ((Math.PI * 2 * Math.pow(radius, 3)) / 3);
      return volume;
   }
   /**
* Returns the that list of stats.
* @return returns the that whole list of stuff.
*/
   public String toString()
   {
      DecimalFormat dFmt = new DecimalFormat("#,##0.0######");
      return "IceCreamCone \"" + label.trim() 
         + "\" with radius = " + dFmt.format(radius).trim() 
         + " and height = " + dFmt.format(height).trim() + " units has:"
         + "\n\tsurface area = " + dFmt.format(surfaceArea()).trim()
         + " square units"
         + "\n\tvolume = " + dFmt.format(volume()).trim()
         + " cubic units";
   }
   /**
* Increments the number of hexagonal prisms.
* @return the number of prisms created.
*/   
   public static int getCount()
   {
      return count;
   }
/**
* Sets the number of hexagonal prisms to zero.
*/   
   public static void resetCount()
   {
      count = 0;
   }
/**
* Checks to see if an object is a hexagonal prism.
* @param obj the object to be checked
* @return true or false if the object is a hexagonal prism.
*/   
   public boolean equals(Object obj)
   {
      if (!(obj instanceof IceCreamCone))
      {
         return false;
      }
      else
      {
         IceCreamCone c = (IceCreamCone) obj;
         return (label.equals(c.getLabel())
                  && Math.abs(radius - c.getRadius()) < .00001
                  && Math.abs(height - c.getHeight()) < .00001); 
      }
   }
/**
* Hashcode for checkstyle.
* @return returns 0.
*/   
   public int hashCode()
   {
      return 0;
   }
}