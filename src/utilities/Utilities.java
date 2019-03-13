package utilities;
public class Utilities {
  
  public static void printArray(int[] array) {
    System.out.print("\n[");
    for(int i = 0; i < array.length; i++) {
      if(i != 0)
        System.out.print(", ");
      System.out.print(array[i]);
    }
    System.out.print("]\n");
  }

}