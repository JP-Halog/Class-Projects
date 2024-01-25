import org.junit.Assert;
import org.junit.Test;
/**
* Tests the methods of Hexagonal Prism.
*
*Proj_08A
*@author John Peter Halog - COMP1210 - 06
*@version 10-28-19
*/
public class IceCreamConeTest
{

/**
* Tests setLabel and getLabel.
*/   
   @Test public void setLabel()
   {
      IceCreamCone test = new IceCreamCone("Test", 1.0, 2.0);
      Assert.assertEquals("Test", test.getLabel());
      test.setLabel("Other");
      Assert.assertEquals("Other", test.getLabel());
      test.toString();
      Assert.assertEquals(true, test.setLabel("test2"));
   }
   /**
* Tests setRadius and getRadius.
*/   
   @Test public void setRadius()
   {
      IceCreamCone test = new IceCreamCone("Test", 1.0, 2.0);
      test.setRadius(2.0);
      Assert.assertEquals(2.0, test.getRadius(), .001);
   }
   /**
* Tests setLabel and getLabel.
*/   
   @Test public void setHeight()
   {
      IceCreamCone test = new IceCreamCone("Test", 1.0, 2.0);
      Assert.assertEquals(2.0, test.getHeight(), .001);
      test.setHeight(1.0);
      Assert.assertEquals(1.0, test.getHeight(), .001);
   }
   /**
* Tests surfaceArea.
*/
   @Test public void surfaceArea()
   {
      IceCreamCone test = new IceCreamCone("Test", 1.0, 2.0);
      Assert.assertEquals(13.308, test.surfaceArea(), .001);
   }
   /**
* Tests resetCount and get count.
*/     
   @Test public void resetCount()
   {
      IceCreamCone.resetCount();
      IceCreamCone test = new IceCreamCone("Test", 1.0, 2.0);
      IceCreamCone test2 = new IceCreamCone("Test 2", 4.0, 7.0);
      Assert.assertEquals(2, test2.getCount());
      IceCreamCone.resetCount();
      Assert.assertEquals(0, IceCreamCone.getCount());
   }
/**
* Tests volume.
*/   
   @Test public void volume()
   {
      IceCreamCone test = new IceCreamCone("Test", 1.0, 2.0);
      Assert.assertEquals(4.189, test.volume(), .001);
   }
     /**
     *test for equals method when false.
     */
   @Test public void equalsTestFalse() {
      IceCreamCone c = new IceCreamCone("Example", 1, 2);
      String c1 = "";
      Assert.assertEquals(false, c.equals(c1));
   }
   /**
     *test for equals method when false 2.
     */
   @Test public void equalsTestFalse2() {
      IceCreamCone c = new IceCreamCone("Example", 1, 2);
      IceCreamCone c1 = new IceCreamCone("Example", 3, 4);
      Assert.assertEquals(false, c.equals(c1));
   }
   /**
     *test for equals method when false 3.
     */
   @Test public void equalsTestFalse3() {
      IceCreamCone c = new IceCreamCone("Example", 3, 6);
      IceCreamCone c1 = new IceCreamCone("Example", 3, 9);
      Assert.assertEquals(false, c.equals(c1));
   }
   /**
     *test for equals method when false 4.
     */
   @Test public void equalsTestFalse4() {
      IceCreamCone c = new IceCreamCone("Example", 4, 0);
      IceCreamCone c1 = new IceCreamCone("Example1", 5, 10);
      Assert.assertEquals(false, c.equals(c1));
   }
   /**
     *test for equals method when true.
     */
   @Test public void equalsTestTrue() {
      IceCreamCone c = new IceCreamCone("Example", 1, 2);
      IceCreamCone c1 = new IceCreamCone("Example", 1, 2);
      Assert.assertEquals(true, c.equals(c1));
   }
   /**
     *test for hashCode method.
     */
   @Test public void hashCodeTest() {
      IceCreamCone c = new IceCreamCone("label", 1.0, 3.0);
      Assert.assertEquals(0, c.hashCode());
   }
}