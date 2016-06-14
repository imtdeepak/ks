package com.ks.sorting;

/**
 * @author 212350436
 */
public class QuickSort {
    public void sort(int[] arr, int low, int high) {
        System.out.println("low: " + low + ", high: " + high);
        if (low < high) {
            if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
                int partioningIndex = partition(arr, low, high);

                // Recursively sort elements before
                // partition and after partition
                sort(arr, low, partioningIndex - 1);
                sort(arr, partioningIndex + 1, high);
            }
        }
    }

    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    int partition(int arr[], int low, int high) {
        System.out.println("Partition low : " + low + " high: " + high);
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String args[]) {
        QuickSort quickSort = new QuickSort();
        int array[] = {10, 7, 8, 9, 1, 5, 5};
        quickSort.sort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.print(i + ", ");
        }
    }
}
