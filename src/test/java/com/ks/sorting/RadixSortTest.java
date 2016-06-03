
package com.ks.sorting;

import org.junit.Test;

@SuppressWarnings("javadoc")
public class RadixSortTest {


    @Test
    public void testRadixSort() {
        int[] input = {8, 3, 5};
        input = RadixSort.radixSort(input);
        for(int i: input){
        System.out.print(i+" ," );
        }
       
    }


}
