package com.ks.basic;

/**
 *
 */
public class Factorial {

    public static void main(String args[]) {
        calculateFactorial(7);
    }

    public static void calculateFactorial(int n){
        int result  = 1;
        for(int i = n; i >= 1; i--) {
            result = result * i;
        }

        System.out.println("Factorial value: " + result);
    }
}
