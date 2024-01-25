import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
*List Constructor of IceCreamCone.
*
*Proj_06_02
*@author John Peter Halog - COMP1210 - 06
*@version 10-15-19
*/
public class IceCreamConeList2 
{
   // Fields
   private String listName;
   private IceCreamCone[] iceList;
   private int numOfIce;
   
   
   // Constructor
   /**
   @param listNameIn input for the listName
   @param iceListIn input for the iceList
   @param numOfIceIn input for the iceList
   */
   public IceCreamConeList2(String listNameIn, 
                           IceCreamCone[] iceListIn, int numOfIceIn) 
   {
      listName = listNameIn;
      iceList = iceListIn;
      numOfIce = numOfIceIn;
   }
   /**
   @return returns the name of the list
   */
   public String getName() 
   {
      return listName;
   }
   /**
   @return retuns the total number of objs in the array
   */
   public int numberOfIceCreamCones() 
   {
      return  numOfIce;
   }
   /**
   @return returns the total surface area
   */
   public double totalSurfaceArea() 
   {
      double total = 0;
   // What value is returned if there are no IceCreamCones in the list?
   
      int index = 0;
      while (index < numOfIce) 
      {
         total += iceList[index].surfaceArea();
         index++;  
      }   
      
      return total;
   }
   /**
   @return returns the total volume
   */      
   public double totalVolume() 
   {
      double total = 0;
   // What value is returned if there are no IceCreamCones in the list?
   
      int index = 0;
      while (index < numOfIce) 
      {
         total += iceList[index].volume();
         index++;  
      }   
      
      return total;
   }
   /**
   @return returns the average volume
   */    
   public double averageVolume() 
   {
      double total = 0;
      double average = 0;
   // What value is returned if there are no IceCreamCones in the list?
   
      int index = 0;
      while (index < numOfIce) 
      {
         total += iceList[index].volume();
         index++;  
      }
      
      if (total == 0) 
      {
         return total;
      }
      else 
      {  
         average = total / index;
      
         return average;
      }
   }
    /**
   @return returns the average surface area
   */    
   public double averageSurfaceArea() 
   {
      double total = 0;
      double average = 0;
   // What value is returned if there are no IceCreamCones in the list?
   
      int index = 0;
      while (index < numOfIce) 
      {
         total += iceList[index].surfaceArea();
         index++;  
      }   
      if (total == 0) 
      {
         return total;
      }
      else 
      {  
         average = total / index;
      
         return average;
      }
   }
   

   /**
   @return returns the string
   */             
   public String toString() 
   {
      String result = "" + listName + "\n";
      int index = 0;
      while (index < numOfIce) 
      {
         result += "\n" + iceList[index] + "\n"; 
         index++;  
      }   
      return result;
   }
   /**
   @return returns the summary
   */    
   public String summaryInfo() 
   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----\n"; 
      result += "Number of IceCreamCone Objects: " 
               + numberOfIceCreamCones() + "\n";
      result += "Total Surface Area: " 
               + df.format(totalSurfaceArea()) + "\n"; 
      result += "Total Volume: "  + df.format(totalVolume()) + "\n";
      result += "Average Surface Area: "  
               + df.format(averageSurfaceArea()) + "\n";
      result += "Average Volume: "  + df.format(averageVolume()) + "\n";
      
      return result;
   }
   
   
   // ---------NEW STUFFS--------
   
   
   /**
    *
    * @return returns the IceCreamCone list
    */
   public IceCreamCone[] getList() 
   {
      return iceList;
   }

   /**
    *
    * @param fileNameIn takes a file name in to look for
    * @return returns the list generated from the file
    * @throws FileNotFoundException incase the file is not found
    */
   public IceCreamConeList2 readFile(String fileNameIn) 
                                    throws FileNotFoundException 
   {
      IceCreamCone[] iceList2 = new IceCreamCone[20];
      String iceListName2 = "";
      String label = "";
      double radius = 0;
      double height = 0;
      int tempNumOfIce = 0;
      String fileName = fileNameIn;
      Scanner scanFile = new Scanner(new File(fileName));
      iceListName2 = scanFile.nextLine();
      while (scanFile.hasNext()) 
      {
         label = scanFile.nextLine();
         radius = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         
         IceCreamCone ice = new IceCreamCone(label, radius, height);
         iceList2[tempNumOfIce] = ice;
         tempNumOfIce++;
      }   
      numOfIce = tempNumOfIce;
      return new IceCreamConeList2(iceListName2, iceList2, 
                                       numOfIce);
   }

   /**
    *
    * @param label takes input for label in the constructor.
    * @param radius takes input for radius in the constructor.
    * @param height takes input for the height in the constructor.
    */
   public void addIceCreamCone(String label, 
                              double radius, double height) 
   {
      IceCreamCone ice = new IceCreamCone(label, radius, height);
      iceList[numOfIce] = ice;
      numOfIce++;
   }

   /**
    *
    * @param label takes the label to find in the arraylist
    * @return returns the object found in the arraylist
    */
   public IceCreamCone findIceCreamCone(String label) 
   {
      int i = 0;
      IceCreamCone ice = new IceCreamCone("", 0, 0);
      while (i < numOfIce)
      {
         ice = iceList[i];
         if (ice.getLabel().compareToIgnoreCase(label) != 0)
         {
            i++;
         } 
         else 
         {
            break;  
         }
      }
      if (ice.getLabel().compareToIgnoreCase(label) != 0)
      {
         return null;
      }
      return ice;  
   }

   /**
    *
    * @param label takes the label to delete from the arraylist
    * @return returns the object deleted
    */
   public IceCreamCone deleteIceCreamCone(String label) 
   {
      int i = 0;
      IceCreamCone ice = new IceCreamCone("", 0, 0);
      while (i < numOfIce)
      {
         ice = iceList[i];
         if (ice.getLabel().compareToIgnoreCase(label) != 0)
         {
            i++;
         } 
         else 
         {
            break;  
         }
      }
      if (ice.getLabel().compareToIgnoreCase(label) != 0)
      {
         return null;
      }
      iceList[i] = null;
      if (i < numOfIce)
      {
         while (i < numOfIce)
         {
            iceList[i] = iceList[i + 1];
            i++;
         }
      }
      numOfIce--;
      
      return ice;  
   } 

   /**
    *
    *
    * @param label takes input for label to find in the arraylist.
    * @param radius takes input for radius in the constructor.
    * @param height takes input for the height in the constructor.
    * @return returns if the edit was successful
    */
   public boolean editIceCreamCone(String label, double radius, 
                                                   double height) 
   {
      int i = 0;
      IceCreamCone ice = new IceCreamCone("", 0, 0);
      while (i < numOfIce)
      {
         ice = iceList[i];
         if (ice.getLabel().compareToIgnoreCase(label) != 0)
         {
            i++;
         } 
         else 
         {
            break;  
         }
      }
      if (ice.getLabel().compareToIgnoreCase(label) != 0)
      {
         return false;
      }
      ice.setRadius(radius);
      ice.setHeight(height);
      return true;  
   }
}
