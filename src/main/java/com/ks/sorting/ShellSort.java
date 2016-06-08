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
 * @version 1.0 6/5/16
 * @since 1.0
 */
public class ShellSort
{
    public static void sort(int[] a) {
        int gap = a.length / 2;
        while (gap > 0) {
            for (int i = gap; i < a.length; i++) {
                int j = i;
                int temp = a[i];
                while (j >= gap && a[j - gap] > temp) {
                    a[j] = a[j - gap];
                    j = j - gap;
                }
                a[j] = temp;
            }
            gap--;
        }
    }
}
