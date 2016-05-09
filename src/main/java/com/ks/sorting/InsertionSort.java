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

/**
 * com.ks.sorting
 *
 * @author 212423767
 * @version 1.0 5/9/16
 * @since 1.0
 */
public class InsertionSort
{
    /**
     * if data[1] < data[0] swap places
     * if data[2] < data[1] swap places
     * if data[1] < data[0] swap places
     * do this until  n
     *
     * O(n2) Worst case
     * O(n) Best Case
     * O(1) Space complexity
     *
     *
     * @param data
     * @return
     */
    public static int[] insertionSort(int[] data){
        for(int i = 1; i < data.length; i++){
            for(int j = i; j > 0; j--){
                if (data[j] < data[j-1]) {
                    int temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }else{
                    break;
                }
            }
        }
        return data;
    }

    /**
     * code as it is from study tonight
     * @param a
     * @return
     */
    public static int[] insertionSort1(int[] a){
        for(int i=1; i<a.length; i++)
        {
            int key = a[i];
            int j = i-1;
            while(j>=0 && key < a[j])
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
        return a;
    }
}
