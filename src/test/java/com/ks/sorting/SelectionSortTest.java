package com.ks.sorting;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SuppressWarnings("javadoc")
public class SelectionSortTest {

  private SelectionSort selectionSort = new SelectionSort();

  @Test
  public void testSelectionSort() {
    int[] input = {1, 5, 7, 2, 4, 6};
    int[] expected = {1, 2, 4, 5, 6, 7};
    this.selectionSort.selectionSort(input);
    assertArrayEquals(input, expected);
  }
}
