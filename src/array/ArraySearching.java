package array;
public class ArraySearching {

  //O(log n) time
  public static int binarySearch(int[] sortedArray, int value) {
    int low = 0;
    int middle = 0;
    int high = sortedArray.length - 1;
    
    //because the array is already sorted, we know that 
    //we can cut the array in half each time and check
    //the middle index value
    while(low <= high) {
      middle = (high + low) / 2;
      
      //if the middle index value is less than what
      //we are looking for, then we move our lower bound
      //pointer to the current middle (and move the higher
      //pointer to the middle if it is greater)
      if(sortedArray[middle] < value)
        low = middle + 1;
      else if(sortedArray[middle] > value)
        high = middle - 1;
      else if(sortedArray[middle] == value)
        return middle;
      else
        break;
    }

    //the process of checking the middle value and then
    //sliding the upper/lower bounds is repeated until a
    //value is found, if not then we return -1
    return -1;
  }

}