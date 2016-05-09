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
}
