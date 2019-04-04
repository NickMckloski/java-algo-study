package problems;

public class FindingSubstrings {

  //this solution kind of sucks but I had to do it quickly, I will redo this
  public static String longestSubstring(String s1, String s2) {
    String longestSubstring = "";
    if(s1 == "") return "";
    
    char[] s1CharArray = s1.toCharArray();
    char[] s2CharArray = s2.toCharArray();
    
    for(int i = 0; i < s1CharArray.length; i++) {
      String currentSubstring = "";
      int s1Index = i;
      int lastS2IndexWithMatch = -1;
      for(int j = 0; j < s2CharArray.length && s1Index < s1CharArray.length; j++) {
        char s1Char = s1CharArray[s1Index];
        char s2Char = s2CharArray[j];
        if(s1Char == s2Char) {
          currentSubstring += s1Char;
          s1Index++;
          lastS2IndexWithMatch = j;
        }
        if(j == s2CharArray.length - 1 && s1Index != s1CharArray.length -1 && lastS2IndexWithMatch != -1) {
          s1Index++;
          j = lastS2IndexWithMatch;
        }
      }
      if(currentSubstring.length() > longestSubstring.length())
        longestSubstring = currentSubstring;
    }
    
    return longestSubstring;
  }
  
}
