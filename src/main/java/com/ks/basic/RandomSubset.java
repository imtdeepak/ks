package com.ks.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Ahil
 */
public class RandomSubset
{
    static List<Integer> getRandomSubset(ArrayList<Integer> list){
        ArrayList<Integer> subset = new ArrayList<Integer>();
        Random random = new Random();
        for(Integer item : list) {

            if(random.nextBoolean()) {
                subset.add(item);
            }
        }
        return subset;
    }

    public static void main(String[] args)
    {
        Integer[] arr = new Integer[] {1, 2, 3};
        ArrayList list = new ArrayList<Integer>(Arrays.asList(arr));

        List<Integer> sublist = getRandomSubset(list);
        System.out.println(sublist);
    }
}
