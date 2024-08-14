package com.ks.datastructures.binarysearch;

import java.util.Arrays;

public class LowerBound {
    public static void main(String[] args){
        int[] arr = { 2, 3, 5, 7, 8, 9, 10, 15, 18, 20, 25};
        System.out.printf("Array Provided : %s%n", Arrays.toString(arr));
        System.out.println(lowerBound(arr, 11));
        System.out.println(lowerBound(arr, 19));
        System.out.println(lowerBound(arr, 6));
        System.out.println(lowerBound(arr, 27));



        System.out.println(lowerBoundBi(arr, 11));
        System.out.println(lowerBoundBi(arr, 19));
        System.out.println(lowerBoundBi(arr, 6));
        System.out.println(lowerBoundBi(arr, 27));

    }

    private static int lowerBound(int[] arr, int key) {
        System.out.printf("Find Lower bound for %d%n", key);
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = low + (high - low)/2;
            if(arr[mid] >= key) {
                high = mid;
            } else {
                low = mid +1;
            }
        }
        if (low <arr.length && key > arr[low] ) {
            low++;
        }
        System.out.println("-------------------------------------------");
        return low;
    }
    private static int lowerBoundBi(int[] arr, int key) {
        System.out.printf("Find Lower bound for %d%n", key);
        int low = 0, high = arr.length;
        int ans = high;
        while (low<high) {
            int mid = (low + high)/2;
            if(arr[mid] >= key) {
                ans = mid;
                high = mid -1;
            } else {
                low = mid +1;
            }
        }
        return ans;
    }
}
