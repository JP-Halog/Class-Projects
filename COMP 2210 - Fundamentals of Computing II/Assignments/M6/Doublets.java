import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import java.util.stream.Collectors;

/**
 * Provides an implementation of the WordLadderGame interface. 
 *
 * @author John Peter Halog (jdh0102@auburn.edu)
 * @author Dean Hendrix (dh@auburn.edu)
 * @version 2020-04-15
 */
public class Doublets implements WordLadderGame {

   // The word list used to validate words.
   // Must be instantiated and populated in the constructor.
   /////////////////////////////////////////////////////////////////////////////
   // DECLARE A FIELD NAMED lexicon HERE. THIS FIELD IS USED TO STORE ALL THE //
   // WORDS IN THE WORD LIST. YOU CAN CREATE YOUR OWN COLLECTION FOR THIS     //
   // PURPOSE OF YOU CAN USE ONE OF THE JCF COLLECTIONS. SUGGESTED CHOICES    //
   // ARE TreeSet (a red-black tree) OR HashSet (a closed addressed hash      //
   // table with chaining).
   /////////////////////////////////////////////////////////////////////////////
   // Constructor
   List<String> EMPTY_LADDER = new ArrayList<>();
   TreeSet<String> lexicon;
   int wordCount;

   /**
    * Instantiates a new instance of Doublets with the lexicon populated with
    * the strings in the provided InputStream. The InputStream can be formatted
    * in different ways as long as the first string on each line is a word to be
    * stored in the lexicon.
    */
   public Doublets(InputStream in) {
      try {
         //////////////////////////////////////
         // INSTANTIATE lexicon OBJECT HERE  //
         lexicon = new TreeSet<String>();
         //////////////////////////////////////
         Scanner s =
            new Scanner(new BufferedReader(new InputStreamReader(in)));
         
         wordCount = 0;
            
         while (s.hasNext()) {
            String str = s.next();
            /////////////////////////////////////////////////////////////
            // INSERT CODE HERE TO APPROPRIATELY STORE str IN lexicon. //
            lexicon.add(str.toLowerCase());
            wordCount++;
            /////////////////////////////////////////////////////////////
            s.nextLine();
         }
         in.close();
      }
      catch (java.io.IOException e) {
         System.err.println("Error reading from InputStream.");
         System.exit(1);
      }
   }


   //////////////////////////////////////////////////////////////
   // ADD IMPLEMENTATIONS FOR ALL WordLadderGame METHODS HERE  //
   //////////////////////////////////////////////////////////////
   public int getHammingDistance(String str1, String str2) {
   
      int result = 0;
      if (str1.length() != str2.length())
      {
         return -1;
      }
      
      char[] string1 = str1.toCharArray();
      char[] string2 = str2.toCharArray();
      
      for (int i = 0; i < str1.length(); i++) 
      {
         if (string1[i] != string2[i]) {
            result++;
         }
      }
      return result;
   }

   public List<String> getMinLadder(String start, String end) 
   {
      start = start.toLowerCase();
      end = end.toLowerCase();
      ArrayList<String> backwards = new ArrayList<String>();
      List<String> minLadder = new ArrayList<String>();
     //If start == end, return self.
      if (start.equals(end)) {
         minLadder.add(start);
         return minLadder;
      }
      //if not same length, return empty ladder
      if (getHammingDistance(start, end) == -1) {
         return EMPTY_LADDER;
      }
   //If both start and end are words, start a search.
      if(isWord(start) && isWord(end)) {
         backwards = bkwds(start, end);
      }
      //If no ladder, return empty ladder
      if (backwards.isEmpty()) {
         return EMPTY_LADDER;
      }
      //Makes backwards ladder forwards
      for (int i = backwards.size() -1; i >= 0; i--) {
         minLadder.add(backwards.get(i));
      }
      return minLadder;
   }
   
   private ArrayList<String> bkwds(String start, String end) {
      Deque<Node> queue = new ArrayDeque<Node>();
      HashSet<String> visited = new HashSet<String>();
      ArrayList<String> backwards = new ArrayList<String>();
      visited.add(start);
      queue.addLast(new Node(start, null));
      Node endNode = new Node(end, null);
      //While the queue isn't empty, search
      outerloop:
      while (!queue.isEmpty()) {
      //Takes first element, gets neighbors and searches.
         Node n = queue.removeFirst();
         String word = n.word;
         List<String> neighbors = getNeighbors(word);
         for (String neighbor : neighbors) {
            if(!visited.contains(neighbor)) {
               visited.add(neighbor);
               queue.addLast(new Node(neighbor, n));
               //If neighbor equals end, make the node endNode's predecessor.
               if (neighbor.equals(end)) {
                  endNode.predecessor = n;
                  break outerloop;
               }
            }
         }
      }
      //Creates a list based on Node chain, is backwards ladder
      if(endNode.predecessor == null)
      {
         return backwards;
      }
      Node m = endNode;
      while (m != null) {
         backwards.add(m.word);
         m = m.predecessor;
      }
      return backwards;
   }
   
   public List<String> getNeighbors(String word) 
   {
      ArrayList result = new ArrayList();
   
   
      //type safety issue
      for (String s: lexicon) {
         if (getHammingDistance(word, s) == 1) {
            result.add(s);
         }
      }
   
      if (result.isEmpty()) {
         return EMPTY_LADDER;
      }
      
      return result;
   }
   
   public int getWordCount() {
   
      return lexicon.size();
   }
   
   public boolean isWord(String str) 
   {
   
      if (lexicon.contains(str)) 
      {
         return true;
      }
   
      return false;
   }
   
   public boolean isWordLadder(List<String> sequence) 
   {
   
      if (sequence.isEmpty()) 
      {
         return false;
      }
     
      for (int i = 0; i < sequence.size() - 1; i++) 
      {
         if (getHammingDistance(sequence.get(i), sequence.get(i + 1)) != 1) 
         {
            return false;
         }
      }
     
      for (int i = 0; i < sequence.size(); i++) 
      {
         if (!lexicon.contains(sequence.get(i))) 
         {
            return false;
         }
      }
     
      return true;  
   }
   
   private class Node {
      String word;
      Node predecessor;
   
      public Node(String s, Node pred)
      {
         word = s;
         predecessor = pred;
      }
   }
}

