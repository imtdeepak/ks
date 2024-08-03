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

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author
 */
public class ShellSortTest
{
    @Test
    public void testShellSort(){
        int[] data = {73, 67, 56, 32, 52, 41, 83, 37, 32, 10};
        int[] expectedOutput = {10, 32, 32, 37, 41, 52, 56, 67, 73, 83};
        System.out.println("input:" + Arrays.toString(data));
        ShellSort.sort(data);
        System.out.println("actualOutput:" + Arrays.toString(data));
        assertArrayEquals(expectedOutput, data);
    }
}
