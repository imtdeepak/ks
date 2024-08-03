package com.ks.sorting;

public class ShellSort {
  public static void sort(int[] arrayToSort) {

    int n = arrayToSort.length;

    for (int gap = n / 2; gap > 0; gap /= 2) {
      for (int i = gap; i < n; i++) {
        int key = arrayToSort[i];
        int j = i;
        while (j >= gap && arrayToSort[j - gap] > key) {
          arrayToSort[j] = arrayToSort[j - gap];
          j -= gap;
        }
        arrayToSort[j] = key;
      }
    }
  }

  public static void main(String args[]) {
    //        ShellSort shellSort = new ShellSort();

    int arr[] = {12, 34, 55, 66, 55, 2, 3};
    sort(arr);
  }
}
