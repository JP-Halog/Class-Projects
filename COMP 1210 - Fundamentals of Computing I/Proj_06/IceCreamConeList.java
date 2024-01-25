import java.util.ArrayList;
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
public class IceCreamConeList 
{
   // Fields
   private String listName;
   private ArrayList<IceCreamCone> iceList;
   
   
   // Constructor
   /**
   @param listNameIn input for the listName
   @param iceListIn input for the iceList
   */
   public IceCreamConeList(String listNameIn, 
                           ArrayList<IceCreamCone> iceListIn) 
   {
      listName = listNameIn;
      iceList = iceListIn;
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
      return  iceList.size();
   }
   /**
   @return returns the total surface area
   */
   public double totalSurfaceArea() 
   {
      double total = 0;
   // What value is returned if there are no IceCreamCones in the list?
   
      int index = 0;
      while (index < iceList.size()) 
      {
         total += iceList.get(index).surfaceArea();
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
      while (index < iceList.size()) 
      {
         total += iceList.get(index).volume();
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
      while (index < iceList.size()) 
      {
         total += iceList.get(index).volume();
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
      while (index < iceList.size()) 
      {
         total += iceList.get(index).surfaceArea();
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
      String result = "\n" + listName + "\n";
      int index = 0;
      while (index < iceList.size()) 
      {
         result += "\n" + iceList.get(index) + "\n"; 
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
      result += "Number of IceCreamCones: " 
               + df.format(numberOfIceCreamCones()) + "\n";
      result += "Total Surface Area: " 
               + df.format(totalSurfaceArea()) + "\n"; 
      result += "Total Volume: "  + df.format(totalVolume()) + "\n";
      result += "Average Surface Area: "  
               + df.format(averageSurfaceArea()) + "\n";
      result += "Average Volume: "  + df.format(averageVolume()) + "\n";
      
      return result;
   }
   
   /**
    *
    * @return returns the IceCreamCone list
    */
   public ArrayList<IceCreamCone> getList() 
   {
      return iceList;
   }

   /**
    *
    * @param fileName takes a file name in to look for
    * @return returns the list generated from the file
    * @throws FileNotFoundException incase the file is not found
    */
   public IceCreamConeList readFile(String fileName) 
                                    throws FileNotFoundException 
   {
      Scanner scanFile = new Scanner(new File(fileName));
      
      ArrayList<IceCreamCone> iceList2 = new ArrayList<IceCreamCone>();
      String iceListName2;
      String label;
      double radius;
      double height;
      
      iceListName2 = scanFile.nextLine();
      while (scanFile.hasNext()) 
      {
         label = scanFile.nextLine();
         radius = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         
         IceCreamCone ice = new IceCreamCone(label, radius, height);
         iceList.add(ice);
      }   
      
      return new IceCreamConeList(iceListName2, iceList2);
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
      iceList.add(ice);
   }

   /**
    *
    * @param label takes the label to find in the arraylist
    * @return returns the object found in the arraylist
    */
   public IceCreamCone findIceCreamCone(String label) 
   {
      for (IceCreamCone ice : iceList) 
      {
         if (ice.getLabel().toLowerCase().equals(label.toLowerCase())) 
         {
            return ice;
         }
      }
      return null;
   }

   /**
    *
    * @param label takes the label to delete from the arraylist
    * @return returns the object deleted
    */
   public IceCreamCone deleteIceCreamCone(String label) 
   {
      int index = iceList.indexOf(findIceCreamCone(label));
      
      if (index >= 0) 
      {
         return iceList.remove(index);
      }
      else 
      {
         return null;
      }
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
      boolean result = false;
      for (IceCreamCone ice : iceList) 
      {
         if (ice.getLabel().equals(label)) 
         {
            ice.setRadius(radius);
            ice.setHeight(height);
            result = true;
            break;
         }
      }
      return result;
   }
}
