/**
 * LinearSearch1.java
 * Provides an (incorrect) implementation of linear search.
 *
 * @author:  John Peter Halog (jdh0102@auburn.edu)
 * @version: 2020-01-26
 *
 */

public final class LinearSearch1 {

   /**
    * Returns the index of the first occurence of target in a or
    * -1 if target is not present. This method implements the
    * linear search algorithm.
    *
    * @param   a  the array to be searched through
    * @param   target  the value to be searched for
    * @return  the index target in a or -1
    */
   public static int search(int[] a, int target) {
      int i = 0;
      while ((i < a.length) && (a[i] != target)) {
         i++;
      }
      if ((i < a.length)) {
         return i;
      }
      else {
         return -1;
      }
   }

}
