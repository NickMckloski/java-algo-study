package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindingSubstrings {

  //this solution to longest common subsequence kind of sucks
  //it is a straight brute force exponential time solution
  public static String lcsNaive(String s1, String s2) {
    String longestSubsequence = "";
    if(s1 == "") return "";
    
    char[] s1CharArray = s1.toCharArray();
    char[] s2CharArray = s2.toCharArray();
    
    for(int i = 0; i < s1CharArray.length; i++) {
      String currentSubsequence = "";
      int s1Index = i;
      int lastS2IndexWithMatch = -1;
      for(int j = 0; j < s2CharArray.length && s1Index < s1CharArray.length; j++) {
        char s1Char = s1CharArray[s1Index];
        char s2Char = s2CharArray[j];
        if(s1Char == s2Char) {
          currentSubsequence += s1Char;
          s1Index++;
          lastS2IndexWithMatch = j;
        }
        if(j == s2CharArray.length - 1 && s1Index != s1CharArray.length -1 && lastS2IndexWithMatch != -1) {
          s1Index++;
          j = lastS2IndexWithMatch;
        }
      }
      if(currentSubsequence.length() > longestSubsequence.length())
        longestSubsequence = currentSubsequence;
    }
    
    return longestSubsequence;
  }
  
  //slightly better solution using a hashmap with all the characters in s2
  //mapped to a list of their corresponding index positions
  //this is still exponential time, but slightly better than the last one
  public static String longestCommonSubsequence(String s1, String s2) {
    String longestSubsequence = "";
    if(s1 == "") return "";
    
    char[] s1CharArray = s1.toCharArray();
    char[] s2CharArray = s2.toCharArray();
    Map<Character, List<Integer>> s2CharMap = new HashMap<Character, List<Integer>>();
    
    //populate the charmap with each char in s2 and its corresponding positions
    for(int i = 0; i < s2CharArray.length; i++) {
      char characterToPlace = s2CharArray[i];
        List<Integer> charPositions =  s2CharMap.containsKey(characterToPlace) ?
                s2CharMap.get(characterToPlace) :
                new ArrayList<Integer>();
        charPositions.add(i);
        s2CharMap.put(characterToPlace, charPositions);
    }

    //starting at each character, loop through the rest of the string
    for(int a = 0; a < s1CharArray.length; a++) {
      int lastPositionSaved = -1;
      String currentSubsequence = "";
      //loop through each remaining char, find the first position of that
      //char in the map that is greater than the last position found
      for(int i = a; i < s1CharArray.length; i++) {
        char charToLookup = s1CharArray[i];
        if(s2CharMap.containsKey(charToLookup)) {
          List<Integer> charPositions = s2CharMap.get(charToLookup);
          for(int j = 0; j < charPositions.size(); j++) {
            int position = charPositions.get(j);
            if(position > lastPositionSaved) {
              lastPositionSaved = position;
              currentSubsequence += charToLookup;
              j = charPositions.size();
            }
          }
        }
      }
      
      if(currentSubsequence.length() > longestSubsequence.length())
        longestSubsequence = currentSubsequence;
    }
    
    return longestSubsequence;
  }
  
}
