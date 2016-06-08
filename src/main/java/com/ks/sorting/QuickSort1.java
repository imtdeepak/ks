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
 * @version 1.0 5/19/16
 * @since 1.0
 */
public class QuickSort1
{
    public static int[] quickSort (int[] data){
        quicksort(data, 0, data.length-1);
        return data;
    }

    private static void quicksort(int a[], int p, int r)
    {
        if(p < r)
        {
            int q;
            q = partition(a, p, r);
            quicksort(a, p, q);
            quicksort(a, q+1, r);
        }
    }

    private static int partition(int a[], int p, int r)
    {
        int i, j, pivot, temp;
        pivot = a[p];
        i = p;
        j = r;
        while(true)
        {
            while(a[i] < pivot && a[i] != pivot)
                i++;
            while(a[j] > pivot && a[j] != pivot)
                j--;
            if(i < j)
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            else
            {
                return j;
            }
        }
    }
}
