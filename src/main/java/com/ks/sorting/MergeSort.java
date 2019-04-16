package com.ks.sorting;


public class MergeSort {

    //int helperArray[];

    public void sort(int[] array) {
        if (array != null && array.length > 0) {
            //helperArray = new int[array.length];
            mergesort(array, 0, array.length - 1);
        }
    }

    void mergesort(int array[], int low, int high) {
        System.out.println("low: " + low + ", high: " + high);
        int middleIndex;
        if (low < high) {

            // divide the list recursively into two halves until it can no more be divided.
            middleIndex = (low + high) / 2;
            //System.out.println("low: " + low + ", high: " + high + ", Middle value: " + middleIndex);
            // Sort the left side of the array
            mergesort(array, low, middleIndex);
           // System.out.println("low: " + low + ", high: " + high + ", Middle value: " + middleIndex);
            // Sort the right side of the array
            mergesort(array, middleIndex + 1, high);

            // merge the smaller lists into new list in sorted order.
            merge(array, low, middleIndex, high);
        }
    }

    void merge(int array[], int low, int middle, int high) {
        //System.out.println("low: " + low + ", high: " + high + ", Middle value: " + middle);
        int helperArray[] = new int[array.length];     //same size of array[]
        int i, j, k;
        k = 0;
        i = low;
        j = middle + 1;

        // Copy the smallest values from either the left or the right side back
        // to the helper array
        while (i <= middle && j <= high) {
            if (array[i] < array[j]) {
                helperArray[k++] = array[i++];       // same as helperArray[k]=array[i]; k++; i++;
            } else {
                helperArray[k++] = array[j++];
            }
        }

        // Copy the rest of the left side of the array into the helper array
        while (i <= middle) {
            helperArray[k++] = array[i++];
        }

        while (j <= high) {
            helperArray[k++] = array[j++];
        }

        // copying back the sorted list to array[]
        for (i = high; i >= low; i--) {
            array[i] = helperArray[--k];
        }
    }

    public static void main(String args[]) {
        MergeSort mergeSort = new MergeSort();
        int[] array = new int[]{54, 26, 93, }; //17, 77, 31, 44, 55, 20, 32, 45, 67, 2, 7};
        mergeSort.sort(array);

        for (int value : array) {
            System.out.print(value + ", ");
        }
    }
}
