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

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

/**
 * com.ks.sorting
 *
 * @author 212423767
 * @version 1.0 5/9/16
 * @since 1.0
 */
public class InsertionSortTest
{

    @Test
    public void testInsertionSortSpaceOofN(){
        int[] input = {6,5,4,3,2,1};
        int[] expectedOutput = {1,2,3,4,5,6};
        System.out.println("input:" + Arrays.toString(input));
        int[] actualOutput =  InsertionSort.insertionSort(input);
        System.out.println("actualOutput:" + Arrays.toString(actualOutput));
        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

}
