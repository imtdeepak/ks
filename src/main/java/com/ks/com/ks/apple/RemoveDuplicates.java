package com.ks.com.ks.apple;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ahil
 */
public class RemoveDuplicates
{

    public static void main(String args[]){
        String a = "fedaadaabababacccddddb";
        removeDuplicatesEff1(a.toCharArray());
        System.out.println(removeDuplicatesEff(a.toCharArray()));
    }

    public static char[] removeDuplicatesEff(char[] str) {
        if (str == null)
            return new char[]{};
        int len = str.length;
        if (len < 2)
            return str;
        boolean[] hit = new boolean[256];
        for (int i = 0; i < 256; ++i)
        {
            hit[i] = false;
        }
        hit[str[0]] = true;
        int tail = 1;
        for (int i = 1; i < len; ++i) {
            if (!hit[str[i]]) {
                str[tail] = str[i];
                ++tail;
                hit[str[i]] = true;
            } else {
                str[tail] = 0;
                ++tail;
            }
        }
        return str;
    }

    public static void removeDuplicatesEff1(char[] str) {
        Set<Character> charUnique = new HashSet();

        if (str == null)
            return ;

        for (char c : str) {
            charUnique.add(c);
        }
        System.out.println(charUnique);
    }

}
