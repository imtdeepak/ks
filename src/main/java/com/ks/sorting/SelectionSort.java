package com.ks.sorting;

/**
 * Selection Sort
 */
public class SelectionSort {


    /**
     * 
     * Selection sorting is conceptually the most simplest sorting algorithm. This algorithm first
     * finds the smallest element in the array and exchanges it with the element in the first
     * position, then find the second smallest element and exchange it with the element in the
     * second position, and continues in this way until the entire array is sorted.
     * 
     * Selection sort is one of the O(n2) sorting algorithms, which makes it quite inefficient for
     * sorting large data volumes
     * 
     * 
     * 
     * Worst Case Time Complexity: O(n2) Best Case Time Complexity : O(n2) Average Time Complexity :
     * O(n2) Space Complexity : O(1)
     * 
     * @param input array to be sorted
     * 
     */

    public void selectionSort(int input[]) {
        if (input != null && input.length > 0) {

        int i, j, min, temp;
        for (i = 0; i < input.length - 1; i++) {
            min = i; // setting min as i
            for (j = i + 1; j < input.length; j++) {
                    if (input[j] < input[min]) {
                        // if element at j is less than element at min position
                    min = j; // then set min as j
                    }
                }
            temp = input[i];
            input[i] = input[min];
            input[min] = temp;
        }
        }
    }
}
