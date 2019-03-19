import array.ArraySearching;
import array.ArraySorting;
import datastructures.DynamicArray;
import utilities.Utilities;

class Main {

  public static void main(String[] args) {
    int[] array = {9, 7, 1, 4, 2, 7, 3, 4, 6, 5};
    
//    Utilities.printArray(array);
//    array = ArraySorting.insertionSort(array);
//    Utilities.printArray(array);
//    
//    System.out.println(ArraySearching.binarySearch(array, 9));
    
//    DynamicArray dynamicArray = new DynamicArray(2);
//    dynamicArray.print();
//    System.out.println("size "+dynamicArray.size());
//    
//    dynamicArray.add(0);
//    dynamicArray.add(1);
//
//    dynamicArray.print();
//    System.out.println("size "+dynamicArray.size());
//    dynamicArray.removeIndex(0);
//    dynamicArray.print();
//    System.out.println("size "+dynamicArray.size());
//    
//    dynamicArray.add(3);
//    dynamicArray.add(4);
//    dynamicArray.add(5);
//
//    dynamicArray.print();
//    System.out.println("size "+dynamicArray.size());
//    
//    dynamicArray.removeElement(4);
//    dynamicArray.print();
//    System.out.println("size "+dynamicArray.size());
//    
//    dynamicArray.addRange(array);
//    dynamicArray.print();
//    System.out.println("size "+dynamicArray.size());
    
    //compute the highest prime number in n
    System.out.println(Utilities.findHighestPrime(787));
  }

}