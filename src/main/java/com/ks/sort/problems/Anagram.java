package com.ks.sort.problems;

import java.util.*;

/**
 * @author Ahil
 */
public class Anagram {
  public static void main(String[] args) {
    String s[] = {"DONALD", "HILLARY", "DNODAL", "RAILLYH"};
    Anagram anagram = new Anagram();
    anagram.sortAnagram(s);
  }

  public void sortAnagram(String[] s) {
    List<String> list = Arrays.asList(s);
    ArrayList<String> arrayList = new ArrayList(list);

    Collections.sort(arrayList, new AnagramCompartor());
    System.out.print("{");
    for (String data : arrayList) {
      System.out.print(data + ",");
    }
    System.out.print("}");
  }
}

class AnagramCompartor implements Comparator {
  public String sort(String s) {
    char c[] = s.toCharArray();
    Arrays.sort(c);
    return s;
  }

  public int compare(Object o1, Object o2) {
    String s1 = sort((String) o1);
    String s2 = sort((String) o2);
    return s1.compareToIgnoreCase(s2);
  }
}
