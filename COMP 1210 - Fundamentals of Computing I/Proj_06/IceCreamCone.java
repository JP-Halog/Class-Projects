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
     
      if (labelIn == null)
      {
         return false;
      }
      else
      {
         label = labelIn.trim();
         return true;
      }
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
   * Returns the cone side area.
   * @return returns the surface area.
   */
   public double coneSideA()
   { // Math for surface area of pyramid
      double coneSideA = (Math.PI * radius)
         * Math.sqrt(Math.pow(height, 2) 
         + Math.pow(radius, 2));
      return coneSideA;
      
   } /**
   * Returns the hemisphere area.
   * @return returns the surface area.
   */
   public double hemiA()
   { // Math for surface area of pyramid
      double hemiA = (Math.PI * 2 * Math.pow(radius, 2));
      return hemiA;
      
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
   * Returns the cone side volume.
   * @return returns the volume.
   */
   public double coneSideV()
   { // Math
      double coneSideV = (Math.PI * height
         * Math.pow(radius, 2)) / 3;
      return coneSideV;
      
   } /**
   * Returns the hemisphere volume.
   * @return returns the volume.
   */
   public double hemiV()
   { //
      double hemiV = (Math.PI * 2
         * Math.pow(radius, 3)) / 3;
      return hemiV;
      
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
         + "\n\tvolume = " + dFmt.format(volume())
         + " cubic units";
   }

   
}