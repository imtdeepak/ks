package com.ks.sorting;

/**
 * @author 212350436
 */
public class BubbleSort {

    public static void main(String args[]) {

        /*
         * In bubble sort, we basically traverse the array from first
         * to array_length - 1 position and compare the element with the next one.
         * Element is swapped with the next element if the next element is greater.
         *
         * Bubble sort steps are as follows.
         *
         * 1. Compare array[0] & array[1]
         * 2. If array[0] > array [1] swap it.
         * 3. Compare array[1] & array[2]
         * 4. If array[1] > array[2] swap it.
         * ...
         * 5. Compare array[n-1] & array[n]
         * 6. if [n-1] > array[n] then swap it.
         *
         * After this step we will have largest element at the last index.
         *
         * Repeat the same steps for array[1] to array[n-1]
         *
         */
        int array [] = new int[]{5, 90, 35, 45, 150, 35, 3, 42};

        System.out.print(" Array: ");
        for(int originalValueIndex = 0; originalValueIndex < array.length; originalValueIndex++) {
            System.out.print(array[originalValueIndex] + ", ");
        }

        for(int i = 0; i < array.length; i++) {
            //System.out.println(" ******* ");

            for(int j = 1; j < (array.length - i); j++) {

                int value1 = array[j - 1];
                int value2 = array[j];

                //System.out.println(" Value 1 : " + value1 + ", Value 2 : " + value2);
                if(value1 > value2) {
                    array[j - 1] = value2;
                    array[j] = value1;
                }
            }
        }

        System.out.print(" \n Sorted Array: ");
        for(int modifiedValueIndex = 0; modifiedValueIndex < array.length; modifiedValueIndex++) {
            System.out.print(array[modifiedValueIndex] + ", ");
        }
    }
}
