package com.ks.sorting;

/** RadixSort Sort */
public class RadixSort {

  /**
   * Worst Case Time Complexity: O(n*k) Best Case Time Complexity : O(n*k) Average Time Complexity :
   * O(n*k) Space Complexity : O(n+k)
   *
   * @param input array to be sorted
   */
  public static int[] radixSort(int[] old) {
    // Loop for every bit in the integers
    for (int shift = Integer.SIZE - 1; shift > -1; shift--) {
      // The array to put the partially sorted array into
      int[] tmp = new int[old.length];
      // The number of 0s
      int j = 0;

      // Move the 0s to the new array, and the 1s to the old one
      for (int i = 0; i < old.length; i++) {
        // If there is a 1 in the bit we are testing, the number will be negative
        int x = old[i] << shift;
        boolean move = x >= 0;
        boolean y = shift == 0 ? !move : move;
        // If this is the last bit, negative numbers are actually lower
        if (y) {
          tmp[j] = old[i];
          j++;
        } else {
          // It's a 1, so stick it in the old array for now
          old[i - j] = old[i];
        }
      }

      // Copy over the 1s from the old array
      for (int i = j; i < tmp.length; i++) {
        tmp[i] = old[i - j];
      }

      // And now the tmp array gets switched for another round of sorting
      old = tmp;
    }

    return old;
  }
}
