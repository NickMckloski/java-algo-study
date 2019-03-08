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
      int min = i;
      
      //the inner loop compares each value at the outer loop's
      //index to the value at the inner loop's index, if
      //the outer index value is greater then swap it with the
      //inner index value
      for(int j = i + 1; j < array.length;j++) {
        if(array[min] > array[j])
          min = j;
      }
      
      int temp = array[i];
      array[i] = array[min];
      array[min] = temp;
    }
    
    //the larger numbers have continuously been swapped further down
    //the array and not the array is in ascending order
    return array;
  }

}