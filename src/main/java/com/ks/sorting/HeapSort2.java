package com.ks.sorting;

/**
 * @author 212350436
 */
// Java program for implementation of Heap Sort
public class HeapSort2 {
    public void sort(int arr[]) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int currentRoot) {
        int largest = currentRoot; // Initialize largest as root
        int left = 2 * currentRoot + 1; // left = 2*i + 1
        int right = 2 * currentRoot + 2; // right = 2*i + 2

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != currentRoot) {
            int swap = arr[currentRoot];
            arr[currentRoot] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) {
        int arr[] = {9, 12, 6, 13, 25, 4, 15, 7, 1, 3, 19};
        int n = arr.length;

        HeapSort2 ob = new HeapSort2();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}
