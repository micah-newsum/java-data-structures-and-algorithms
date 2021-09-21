package com.newsum.algorithms.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequent {
  /**
   * Returns the k most frequent integers in an array.
   * @param input
   * @param k
   * @return
   */
  public static List<Integer> getKFrequent(int[] input, int k){
    Map<Integer,Integer> counts = new HashMap<>();

    for (int i = 0; i < input.length; i++) {
      int count = counts.getOrDefault(input[i], 0);
      counts.put(input[i], ++count);
    }

    // create a list of tuples, with the tuple being the integer -> count
    List<Map.Entry<Integer,Integer>> list = new ArrayList<>(counts.entrySet());
    Collections.sort(
        list,
        (count1,count2) -> count2.getValue().compareTo(count1.getValue())
        );

    List kFrequent = new ArrayList();

    for (int i = 0; i < k; i++){
      kFrequent.add(list.get(i).getKey());
    }

    return kFrequent;
  }

  public static void main(String args[]){
    int[] input = {1,2,3,3,4,5,5,5,6,7,7,8,8,9,9,9,9};
    System.out.println(getKFrequent(input,2));
  }
}
