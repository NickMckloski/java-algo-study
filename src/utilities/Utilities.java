package utilities;

import java.util.Arrays;

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
  
  //finds the highest prime number up to n,
  //the Sieve of Eratosthenes method takes O(n log(log n)) time
  public static int findHighestPrime(int n) {
	  if(n <= 0)
	    return -1;
	  else if (n <= 3)
      return n;
    
	  //use the Sieve of Eratosthenes to mark all prime[i]
	  //to true if i is a prime number.
	  boolean[] prime = new boolean[n+1];
	  Arrays.fill(prime, Boolean.TRUE);
	  
	  //The loop goes through each index marked as true and sets
	  //multiples of itself to false. So first all multiples of 2
	  //are marked false, then all multiples of three (multiples 
	  //of 4 were already marked by the first pass when it checked for
	  //multiples of 2), then all multiples of 5.... this will continue
	  //until the sqrt(n), which is the highest possible prime number
	  for(int i = 2; i * i <= n; i++) {
	    if(prime[i]) {
	      for(int j = i * i; j <= n; j += i) {
	        prime[j] = false;
	      }
	    }
	  }
    
	  //now that we have all the prime numbers marked we start at n 
	  //and go backwards until we hit a prime	  
	  for(int i = n; i > 0; i--) {
	    if(prime[i]) return i;
	  }
	  
    return -1;
  }

}