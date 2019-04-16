package com.ks.basic;

import java.util.Scanner;

/**
 * @author 212350436
 */
public class ReverseNumber {
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);
       int number = scanner.nextInt();

       int reverseNumber = 0;
       while(number != 0) {
           reverseNumber = reverseNumber * 10;
           reverseNumber = reverseNumber + number % 10;
           number = number / 10;
       }
        System.out.println("Reverse number: " + reverseNumber);
    }
}
