package com.ks.sorting;

public class ShellSort
{
    public static void sort(int[] array) {

        int n = array.length;

        for(int gap = n/2; gap > 0; gap /= 2) {
            System.out.println(" gap: " + gap);

            for(int i = gap; i < n; i += 1) {
                System.out.println("i: " + i);


            }
        }
    }

    public static void main(String args[]) {
//        ShellSort shellSort = new ShellSort();

        int arr[] = {12, 34, 55, 66, 55, 2, 3};
        sort(arr);
    }
}
