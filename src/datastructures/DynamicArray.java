package datastructures;

import java.util.Arrays;

import array.ArrayUtilities;

//this is an implementation of a dynamic array (like ArrayList)
public class DynamicArray<T> {

  private int[] array;
  
  private int size;
  
  //default initialization length is 20
  public DynamicArray() {
    array = new int[20];
    size = 0;
  }
  
  public DynamicArray(int initialLength) {
    array = new int[initialLength];
    size = 0;
  }
  
  //checks if the required size of the array will be
  //enough, if not then it creates a new array with more
  //space and copies the data into it
  private void checkCapacity(int newSize) {
    if(newSize > array.length) {
      //each time we have to increase the space of the array
      //we double it. We do this to reach an amortized constant time
      //for insertions. If we only added a constant amount of space
      //each time the array was full, then we would end up doing MUCH more
      //array copies (a linear action) as more elements are added.
      //By multiplying the space we get constant time as more and more
      //elements are added
      int newLength = array.length * 2;
      int[] newArray = new int[newLength];
      
      for(int i = 0; i < array.length; i++) {
        newArray[i] = array[i];
      }
      
      array = newArray;
    }
  }
  
  public int size() {
    return size;
  }
  
  //prints the current filled array, ignores extra space
  public void print() {
    ArrayUtilities.printArray(Arrays.copyOfRange(array, 0, size));
  }
  
  //adds an element to the array
  public void add(int element) {
    checkCapacity(size + 1);
    array[size++] = element;
  }
  
  //adds a range of elements to the array
  public void addRange(int[] elements) {
    checkCapacity(size + elements.length);
    for(int element : elements) {
      add(element);
    }
  }
  
  //removes an element at given index
  public void removeIndex(int index) {
    for(int i = index; i < size - 1; i++) {
      array[index] = array[index + 1];
    }
    size--;
  }
  
  //removes the first occurrence of an element
  public void removeElement(int element) {
    for(int i = 0; i < size; i++) {
      if(array[i] == element) {
        for(int j = i; j < size - 1; j++) {
          array[i] = array[i + 1];
        }
        size--;
        break;
      }
    }
  }
  
}
