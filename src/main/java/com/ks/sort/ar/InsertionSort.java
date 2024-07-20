package com.ks.sort.ar;

/**
 * @author 212350436
 */
public class InsertionSort {

  public static void main(String args[]) {
    int a[] = {5, 1, 6, 2, 4, 3};
    InsertionSort is = new InsertionSort();
    is.sort(a);

    for (int a1 : a) {
      System.out.print(a1 + ", ");
    }
  }

  public void sort(int[] arr) {
    if (arr != null) {
      for (int i = 1; i < arr.length; i++) {
        int key = arr[i];

        for (int j = i - 1; j >= 0; j--) {
          int previousValue = arr[j];

          if (previousValue > key) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j] = temp;
          }
        }
      }
    }
  }
}
