import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
/**
*List Constructor of IceCreamCone.
*
*Proj_08_02
*@author John Peter Halog - COMP1210 - 06
*@version 11-03-19
*/
public class IceCreamConeList2Test {

/** This method is a test for the getters methods. **/
   @Test public void gettersTest()
   {
      IceCreamCone[] tList = new IceCreamCone[100];
      IceCreamConeList2 cList = new IceCreamConeList2("label", tList, 3);
   
      Assert.assertEquals("getName test", "label", cList.getName());
      Assert.assertArrayEquals("getList test", tList, cList.getList());
   }
   
   /** This method is a test for the numberOfIceCreamCones method. **/
   @Test public void numberOfIceCreamConesTest()
   {
      IceCreamCone[] tList = new IceCreamCone[100];
      IceCreamConeList2 cList = new IceCreamConeList2("label", tList, 3);
      
      Assert.assertEquals("numberOfIceCreamCones test",
         3, cList.numberOfIceCreamCones());
   }

   
   /** This method is a test for the totalSurfaceArea method. **/
   @Test public void totalSurfaceAreaTest()
   {
      IceCreamCone[] tList = new IceCreamCone[100];
      IceCreamCone c = new IceCreamCone("label", 1, 2);
      IceCreamCone d = new IceCreamCone("label", 3, 4);
      tList[0] = c;
      tList[1] = d;
      IceCreamConeList2 cList = new IceCreamConeList2("label", tList, 2);
      
      Assert.assertEquals("totalSurfaceArea test",
         c.surfaceArea() + d.surfaceArea(),
         cList.totalSurfaceArea(), .001);
   }
   
   /** This method is a test for the totalVolume method. **/
   @Test public void totalVolumeTest()
   {
      IceCreamCone[] tList = new IceCreamCone[100];
      IceCreamCone c = new IceCreamCone("label", 1, 2);
      IceCreamCone d = new IceCreamCone("label", 3, 4);
      tList[0] = c;
      tList[1] = d;
      IceCreamConeList2 cList = new IceCreamConeList2("label", tList, 2);
      
      Assert.assertEquals("totalVolume test",
         c.volume() + d.volume(),
         cList.totalVolume(), .001);
   }
   
   /** This method is a test for the averageSurfaceArea method. **/
   @Test public void averageSurfaceAreaTest()
   {
      IceCreamCone[] tList = new IceCreamCone[100];
      IceCreamCone c = new IceCreamCone("label", 1, 2);
      IceCreamCone d = new IceCreamCone("label", 3, 4);
      tList[0] = c;
      tList[1] = d;
      IceCreamConeList2 cList = new IceCreamConeList2("label", tList, 2);
      
      Assert.assertEquals("averageSurfaceArea test",
         (c.surfaceArea() + d.surfaceArea()) / 2,
         cList.averageSurfaceArea(), .001);
         
      IceCreamCone[] dList = new IceCreamCone[100];
      IceCreamConeList2 eList = new IceCreamConeList2("label", tList, 0);
      Assert.assertEquals("averageVolume test for 0 elements",
         0, eList.averageSurfaceArea(), .001);
   }
   
   /** This method is a test for the averageVolume method. **/
   @Test public void averageVolumeTest()
   {
      IceCreamCone[] tList = new IceCreamCone[100];
      IceCreamCone c = new IceCreamCone("label", 1, 2);
      IceCreamCone d = new IceCreamCone("label", 3, 4);
      tList[0] = c;
      tList[1] = d;
      IceCreamConeList2 cList = new IceCreamConeList2("label", tList, 2);
      
      Assert.assertEquals("averageVolume test",
         (c.volume() + d.volume()) / 2,
         cList.averageVolume(), .001);
         
      IceCreamCone[] dList = new IceCreamCone[100];
      IceCreamConeList2 eList = new IceCreamConeList2("label", tList, 0);
      Assert.assertEquals("averageVolume test for 0 elements",
         0, eList.averageVolume(), .001);
   }
   
   /** This method is a test for the toString method. **/
   @Test public void toStringTest()
   {
      IceCreamCone[] tList = new IceCreamCone[100];
      IceCreamCone c = new IceCreamCone("label", 1, 2);
      tList[0] = c;
      IceCreamConeList2 cList = new IceCreamConeList2("label", tList, 3);
      
      Assert.assertTrue("toString test",
         cList.toString().contains("IceCreamCone"));
   }
   
   /** This method is a test for the summaryInfo method. **/
   @Test public void summaryInfoTest()
   {
      IceCreamCone[] tList = new IceCreamCone[100];
      IceCreamCone c = new IceCreamCone("label", 1, 2);
      tList[0] = c;
      IceCreamConeList2 cList = new IceCreamConeList2("cones", tList, 1);
      
      Assert.assertTrue("summaryInfo test",
         cList.summaryInfo().contains("IceCreamCone"));
   }
   
   /** This method is a test for the readFile method.
   * @throws IOException for scanning a file.
   **/
   @Test public void readFileTest() throws IOException
   {
      IceCreamCone[] tList = new IceCreamCone[100];
      IceCreamConeList2 cList = new IceCreamConeList2(
         "IceCreamCone List 1", tList, 1);
   
      cList.readFile("IceCreamCone_data_1.txt");
   
      Assert.assertEquals("readFile test", "IceCreamCone List 1",
         cList.getName());
   }
   
   /** This method is a test for the addIceCreamCone method. **/
   @Test public void addIceCreamConeTest()
   {
      IceCreamCone[] tList = new IceCreamCone[100];
      IceCreamConeList2 cList = new IceCreamConeList2("label", tList, 0);
      cList.addIceCreamCone("c", 1, 2);
      
      Assert.assertEquals("addIceCreamCone test", 1,
         cList.numberOfIceCreamCones());
   }
   
   /** This method is a test for the findIceCreamCone method. **/
   @Test public void findIceCreamConeTest()
   {
      int arrSizeTest = 0;
      IceCreamCone[] iceList = new IceCreamCone[100];
      for (int i = 0; i < 5; i++) {
         IceCreamCone ice = new IceCreamCone("test" + i, i + .25,
                                                          i + .25);
         iceList[i] = ice;
         arrSizeTest++;
      }
      IceCreamConeList2 iceTest2 = new IceCreamConeList2("",  
                                                   iceList, arrSizeTest);
      IceCreamCone dTrue = new IceCreamCone("test4", 4.25, 4.25);
      Assert.assertEquals("", dTrue, iceTest2.findIceCreamCone("test4"));
   }
   
   /** This method is a test for the deleteIceCreamCone method. **/
   @Test public void deleteIceCreamConeTest()
   {
      IceCreamCone[] tList = new IceCreamCone[100];
      IceCreamCone c = new IceCreamCone("cone", 1, 2);
      IceCreamCone c2 = new IceCreamCone("cone2", 1, 2);
      IceCreamCone c3 = new IceCreamCone("cone3", 1, 2);
      tList[0] = c;
      tList[1] = c2;
      tList[2] = c3;
     
      IceCreamConeList2 cList = new IceCreamConeList2("label", tList, 3);
      
      cList.deleteIceCreamCone("cone3");
      
      Assert.assertEquals("deleteIceCreamCone test", null, tList[2]);
   }
   
   /** This method is a test for the editIceCreamCone method. **/
   @Test public void editIceCreamConeTest()
   {
      IceCreamCone[] tList = new IceCreamCone[100];
      IceCreamCone c = new IceCreamCone("cone", 1, 2);
      IceCreamCone c2 = new IceCreamCone("cone1", 3, 4);
      IceCreamCone c3 = new IceCreamCone("cone2", 5, 6);
      tList[0] = c;
      tList[1] = c2;
      tList[2] = c3;
      IceCreamConeList2 cList = new IceCreamConeList2("label", tList, 3);
      
      cList.editIceCreamCone("cone2", 7, 8);
      
      Assert.assertEquals("editIceCreamCone test", 7,
         tList[2].getRadius(), .001);
   }
   
   /** This method is a test for the findIceCreamCostVolume method. **/
   @Test public void findIceCreamConeWithSmallestVolumeTest()
   {
      IceCreamCone[] tList = new IceCreamCone[100];
      IceCreamCone c = new IceCreamCone("label", 3, 4);
      IceCreamCone d = new IceCreamCone("different", 1, 2);
      IceCreamCone e = new IceCreamCone("other", 5, 6);
      tList[0] = c;
      tList[1] = d;
      tList[2] = e;
      IceCreamConeList2 cList = new IceCreamConeList2("array", tList, 3);
      
      IceCreamCone f = cList.findIceCreamConeWithSmallestVolume();
      
      Assert.assertEquals("findIceCreamConeWithSmallestVolume test", d, f);
   }
   
   /** This method is a test for the null output of
   the findIceCreamConeWithSmallestVolume method. **/
   @Test public void findIceCreamConeWithSmallestVolumeTestNegative()
   {
      IceCreamCone[] tList = new IceCreamCone[100];
      IceCreamCone c = new IceCreamCone("label", 1, 2);
      IceCreamCone d = new IceCreamCone("different", 3, 4);
      IceCreamCone e = new IceCreamCone("other", 5, 6);
      tList[0] = c;
      tList[1] = d;
      tList[2] = e;
      IceCreamConeList2 cList = new IceCreamConeList2("array", tList, 0);
      
      IceCreamCone f = cList.findIceCreamConeWithSmallestVolume();
      
      Assert.assertEquals("findIceCreamConeWithSmallestVolume test",
         null, f);
   }
   
   /** This method is a test for the findIceCreargeestVolume method. **/
   @Test public void findIceCreamConeWithLargeestVolumeTest()
   {
      IceCreamCone[] tList = new IceCreamCone[100];
      IceCreamCone c = new IceCreamCone("label", 1, 2);
      IceCreamCone d = new IceCreamCone("different", 5, 6);
      IceCreamCone e = new IceCreamCone("other", 3, 4);
      tList[0] = c;
      tList[1] = d;
      tList[2] = e;
      IceCreamConeList2 cList = new IceCreamConeList2("array", tList, 3);
      
      IceCreamCone f = cList.findIceCreamConeWithLargestVolume();
      
      Assert.assertEquals("findIceCreamConeWithLargeestVolume test", d, f);
   }
   
   /** This method is a test for the null output of
   the findIceCreamConeWithLargeestVolume method. **/
   @Test public void findIceCreamConeWithLargestVolumeTestNegative()
   {
      IceCreamCone[] tList = new IceCreamCone[100];
      IceCreamCone c = new IceCreamCone("label", 1, 2);
      IceCreamCone d = new IceCreamCone("different", 3, 4);
      IceCreamCone e = new IceCreamCone("other", 5, 6);
      tList[0] = c;
      tList[1] = d;
      IceCreamConeList2 cList = new IceCreamConeList2("array", tList, 0);
      
      IceCreamCone f = cList.findIceCreamConeWithLargestVolume();
      
      Assert.assertEquals("findIceCreamConeWithLargeestVolume test",
         null, f);
   }
   
   /** This method is a test for the findIceCreRadius method. **/
   @Test public void findIceCreamConeWithShortestRadiusTest()
   {
      IceCreamCone[] tList = new IceCreamCone[100];
      IceCreamCone c = new IceCreamCone("label", 3, 4);
      IceCreamCone d = new IceCreamCone("different", 1, 2);
      IceCreamCone e = new IceCreamCone("other", 5, 6);
      tList[0] = c;
      tList[1] = d;
      tList[2] = e;
      IceCreamConeList2 cList = new IceCreamConeList2("array", tList, 3);
      
      IceCreamCone f = cList.findIceCreamConeWithShortestRadius();
      
      Assert.assertEquals("findIceCreamConeWithShortestRadius test", d, f);
   }
   
   /** This method is a test for the null output of
   the findIceCreamConeWithShortestRadius method. **/
   @Test public void findIceCreamConeWithShortestRadiusTestNegative()
   {
      IceCreamCone[] tList = new IceCreamCone[100];
      IceCreamCone c = new IceCreamCone("label", 1, 2);
      IceCreamCone d = new IceCreamCone("different", 3, 4);
      IceCreamCone e = new IceCreamCone("other", 5, 6);
      tList[0] = c;
      tList[1] = d;
      tList[2] = e;
      IceCreamConeList2 cList = new IceCreamConeList2("array", tList, 0);
      
      IceCreamCone f = cList.findIceCreamConeWithShortestRadius();
      
      Assert.assertEquals("findIceCreamConeWithShortestRadius test", null, f);
   }
   
   /** This method is a test for the findIceCstRadius method. **/
   @Test public void findIceCreamConeWithLongestRadiusTest()
   {
      IceCreamCone[] tList = new IceCreamCone[100];
      IceCreamCone c = new IceCreamCone("label", 1, 2);
      IceCreamCone d = new IceCreamCone("different", 5, 6);
      IceCreamCone e = new IceCreamCone("other", 3, 4);
      tList[0] = c;
      tList[1] = d;
      tList[2] = e;
      IceCreamConeList2 cList = new IceCreamConeList2("array", tList, 3);
      
      IceCreamCone f = cList.findIceCreamConeWithLongestRadius();
      
      Assert.assertEquals("findIceCreamConeWithLongestRadius test", d, f);
   }
   
   /** This method is a test for the null output
   of the findIceCreamConeWithLargeestVolume method. **/
   @Test public void findIceCreamConeWithLongestRadiusTestNegative()
   {
      IceCreamCone[] tList = new IceCreamCone[100];
      IceCreamCone c = new IceCreamCone("label", 1, 2);
      IceCreamCone d = new IceCreamCone("different", 3, 4);
      IceCreamCone e = new IceCreamCone("other", 5, 6);
      tList[0] = c;
      tList[1] = d;
      tList[2] = e;
      IceCreamConeList2 cList = new IceCreamConeList2("array", tList, 0);
      
      IceCreamCone f = cList.findIceCreamConeWithLongestRadius();
      
      Assert.assertEquals("findIceCreamConeWithLongestRadius test",
         null, f);
   }
}