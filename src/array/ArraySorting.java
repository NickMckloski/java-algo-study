package array;
public class ArraySorting {

  //O(n^2) time
  public static int[] bubbleSort(int[] array) {
    //outer loop runs from the end of the array to the
    //start of the array
    for (int i = array.length - 1; i > 0; i--) {
      //inner loop compares each adjacent element and
      //moves the larger one up
      for(int j = 0; j < i; j++) {
        if(array[j] > array[j+1]) {
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }
    //after all the comparisons are done the largest 
    //elements will be at the end of the array
    //and the array will be in ascending order
    return array;
  }
  
  //O(n^2) time
  public static int[] selectionSort(int[] array) {
    //outer loop runs through the entire array
    for(int i = 0; i < array.length; i++) {
      int lowestValueIndex = i;
      
      //the inner loop checks the rest of the array for the
      //smallest possible value and swaps it towards the front
      for(int j = i + 1; j < array.length;j++) {
        if(array[lowestValueIndex] > array[j])
          lowestValueIndex = j;
      }
      
      int temp = array[i];
      array[i] = array[lowestValueIndex];
      array[lowestValueIndex] = temp;
    }
    
    //the larger numbers have continuously been swapped further down
    //the array and not the array is in ascending order
    return array;
  }

  //O(n^2) time
  public static int[] insertionSort(int[] array) {
    //outer loop begins with the second element and
    //loops to the end of the array, each pass is finding
    //where in the array the value needs to be placed
    for(int i = 1; i < array.length; i++) {
      int j = i;
      int valueToInsert = array[i];
      
      //looping backwards, every element is shifted up one
      //space until the previous element is no longer larger
      while(j > 0 && array[j-1] > valueToInsert) {
        array[j] = array[--j];
      }
      
      //the value is then inserted
      array[j] = valueToInsert;
    }
    
    return array;
  }
  
}