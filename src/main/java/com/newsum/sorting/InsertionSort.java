package com.newsum.sorting;

import com.newsum.adt.Sortable;

/**
 * Partitions the array into two sections: sorted and unsorted.
 */
public class InsertionSort implements Sortable {
  @Override
  public void sort(int[] input) {
    // starts with the understanding that the first element of an array with length 1 is already sorted.
    for (int firstUnsortedIndex = 1; firstUnsortedIndex < input.length; firstUnsortedIndex++){
      int temp = input[firstUnsortedIndex];

      int i;

      for (i = firstUnsortedIndex; i > 0 && input[i - 1] > temp; i--){
        input[i] = input[i - 1]; // shift from left to right
      }

      input[i] = temp;
    }
  }
}
