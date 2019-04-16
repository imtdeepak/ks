/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
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
        ShellSort shellSort = new ShellSort();

        int arr[] = {12, 34, 55, 66, 55, 2, 3};
        sort(arr);
    }
}
