import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

/**
* RandomList.java - Implements the RandomizedList interface to
* randomly access created lists by the sample or remove method.
*
* @author John Peter Halog (jdh0102@auburn.edu)
* @author Dean Hendrix (dh@auburn.edu)
* @version 3/15/20
*/

public class RandomList<T> implements RandomizedList<T>
{
   private T[] elements;
   private int size;
   private static final int DEFAULT_LENGTH = 5;
   /**
   * Default constructor
   */
   public RandomList() {
      this(DEFAULT_LENGTH);
   }
   
   /**
   * Constructor
   */
   @SuppressWarnings("unchecked") //Gets rid of warning
   public RandomList(int length) { 
      elements = (T[]) new Object[length];
      size = 0;
   }
   
    /**
    * Returns the number of elements in this list.
    */
   public int size() {
      return size;
   }
 
   /**
    * Returns true if this list contains no elements, false otherwise.
    */
   public boolean isEmpty() {
      return size == 0;
   }
    
   /**
    * Adds the specified element to this list. If the element is null, this
    * method throws an IllegalArgumentException.
    */
   public void add(T element){ 
      if (element == null)
      {
         throw new IllegalArgumentException();
      }
      //Resizes array if full
      if (size == elements.length)
      {
         resize(elements.length*2);
      }
      elements[size] = element;
      size++;
   }
  
   /**
    * Selects and removes an element selected uniformly at random from the
    * elements currently in the list. If the list is empty this method returns
    * null.
    */
   public T remove() {
      if (this.isEmpty()) {
         return null;
      }
      Random rand = new Random();
      int value = rand.nextInt(size); //Choose random number
      T removed = elements[value]; //Remember removed element to return
      elements[value] = null; // Remove element
      //Now, if value isn't the last item, switch the last value with this value
      if (value != (size-1)) { //(Size - 1) = last index
         elements[value] = elements[size-1];
         elements[size-1] = null;
      }
      size --; //Now that items have been switched, minus size.
      //if array is less than 25% full, reduce array length to half.
      if (size > 0 && size < elements.length / 4) {
         resize(elements.length/2);
      }
      return removed;
   }
   
   /**
    * Selects but does not remove an element selected uniformly at random from
    * the elements currently in the list. If the list is empty this method
    * return null.
    */
   public T sample() {
      if (this.isEmpty()) {
         return null;
      }
      Random rand = new Random();
      int value = rand.nextInt(size); //Choose random number
      return elements[value];
   }
   
   /**
    * Creates and returns an iterator over the elements of this list.
    */
   public Iterator<T> iterator() {
      return new ArrayIterator(elements, size);
   }
   
   /**
   * Resizes an array
   */   
   private void resize(int length) {
      T[] a = (T[]) new Object[length];
      for (int i = 0; i < size(); i ++) {
         a[i] = elements[i];
      }
      elements = a;
   }
   
  /** 
   * Nested class that makes an iterator.
   */
   public class ArrayIterator<T> implements Iterator<T> {
      private T[] items; //The array of elements iterated over
      private int length; //The number of elements in the array
      /**
      * Constructor
      */
      public ArrayIterator(T[] elements, int sizeIn) {
         items = elements;
         length = sizeIn;
      }
      
      /**
      * Checks to see if there is a next element
      */
      public boolean hasNext() {
         return (length > 0); //As long as length > 0, still has a next, since next removes size.
      }
      
      /**
      * Remove(), for our purposes throws UnsupportedOperationException (since we
      * already have a remove function in the List).
      */
      public void remove() {
         throw new UnsupportedOperationException();
      }
      
      /**
      * Returns the next item in the list, or throws a NoSuchElementException if 
      * there are no more elements.
      */
      public T next() {
         if (!hasNext()) {
            throw new NoSuchElementException();
         }
         Random rand = new Random();
         int value = rand.nextInt(length); //Choose random number from remaining elements.
         T next = items[value]; //Remember removed element to return
      //Now, if value isn't the last item, switch with last
         if (value != (length-1)) { //(Size - 1) = last index
            items[value] = items[length-1];
            items[length-1] = next;
         }
         length--;
         return next;
      }
   }
}