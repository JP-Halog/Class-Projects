import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * LinearSearch2Test.java
 * Illustrates JUnit tests for the LinearSearch2 class.
 *
 * @author:  John Peter Halog (jdh0102@auburn.edu)
 * @version: 2020-01-26
 *
 */
public class MinOfThreeTest {


   @Test // 000
   public void testMin1a() {
      int actual = MinOfThree.min1(1, 1, 1);
      int expected = 1;
      assertEquals(expected, actual);
   }

   @Test // 012
   public void testMin1b() {
      int actual = MinOfThree.min1(1, 2, 3);
      int expected = 1;
      assertEquals(expected, actual);
   }
   
   @Test // 102
   public void testMin1c() {
      int actual = MinOfThree.min1(1, 0, 2);
      int expected = 0;
      assertEquals(expected, actual);
   }
   
   @Test // 120
   public void testMin1d() {
      int actual = MinOfThree.min1(1, 2, 0);
      int expected = 0;
      assertEquals(expected, actual);
   }
   
   @Test // 000
   public void testMin2a() {
      int actual = MinOfThree.min2(1, 1, 1);
      int expected = 1;
      assertEquals(expected, actual);
   }

   @Test // 012
   public void testMin2b() {
      int actual = MinOfThree.min2(1, 2, 3);
      int expected = 1;
      assertEquals(expected, actual);
   }
   
   @Test // 102
   public void testMin2c() {
      int actual = MinOfThree.min2(1, 0, 2);
      int expected = 0;
      assertEquals(expected, actual);
   }
   
   @Test // 120
   public void testMin2d() {
      int actual = MinOfThree.min2(1, 2, 0);
      int expected = 0;
      assertEquals(expected, actual);
   }
   
   
   @Test 
   public void brokenTest() {
      int actual = MinOfThree.min1(2, 2, 3);
      int expected = 2;
      assertEquals(expected, actual);
   }
}