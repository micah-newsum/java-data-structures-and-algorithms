package com.newsum.sorting;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.newsum.adt.Sortable;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {
  @Test
  void givenArrayUnsortedSortableSorts(){
    int[] input = {20, 35, -15, 7, 55, 1, -22};
    Sortable sortable = new InsertionSort();
    sortable.sort(input);
    assertThat(input[0]).isEqualTo(-22);
    assertThat(input[input.length - 1]).isEqualTo(55);
  }
}
