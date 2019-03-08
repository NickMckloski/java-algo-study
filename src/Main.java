import array.ArraySearching;
import array.ArraySorting;

class Main {

  public static void main(String[] args) {
    int[] array = {9, 7, 1, 4, 2, 7, 3, 4, 6, 5};
    
    Utilities.printArray(array);
    array = ArraySorting.selectionSort(array);
    Utilities.printArray(array);
    
    System.out.println(ArraySearching.binarySearch(array, 9));
  }

}