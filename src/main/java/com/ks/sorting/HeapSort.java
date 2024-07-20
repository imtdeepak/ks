package com.ks.sorting;

/**
 * @author 212350436
 */
public class HeapSort {
  public static void main(String args[]) {
    int arr[] = {9, 12, 6, 13, 25, 4, 15, 7, 1, 3, 19};
    HeapSort heapSort = new HeapSort();
    heapSort.sort(arr);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ", ");
    }
  }

  public void sort(int[] array) {
    if (array != null) {
      // Build the heap in array a so that largest value is at the root
      buildheap(array, array.length);

      int heapsize = array.length - 1;
      int temp;

      // One by one extract an element from heap
      for (int i = heapsize; i >= 0; i--) {
        // Move current root to end
        temp = array[0];
        array[0] = array[heapsize];
        array[heapsize] = temp;
        heapsize--;

        // call max heapify on the reduced heap
        heapify(array, 0, heapsize);
      }
    }
  }

  void buildheap(int a[], int length) {
    int i;
    int heapsize = length - 1;
    for (i = (length / 2); i >= 0; i--) {
      heapify(a, i, heapsize);
    }
  }

  // i which is an index in arr[]. n is size of heap
  public void heapify(int[] array, int i, int heapsize) {

    int temp;
    int largest = i;
    int left = 2 * i; // left
    int right = 2 * i + 1; // right

    System.out.println(
        "i: " + i + ", heapSize: " + heapsize + ", left: " + left + ", " + "right: " + right);

    // If left child is larger than root
    if (left <= heapsize && array[left] > array[i]) {
      largest = left;
    }

    // If right child is larger than largest so far
    if (right <= heapsize && array[right] > array[largest]) {
      largest = right;
    }

    // If largest is not root
    if (largest != i) {
      temp = array[i];
      array[i] = array[largest];
      array[largest] = temp;

      // Recursively heapify the affected sub-tree
      heapify(array, largest, heapsize);
    }

    // System.out.println();
  }
}
