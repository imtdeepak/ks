package com.ks.basic;

/**
 * @author
 */
public class Factorial {

    public static void main(String args[]) {
        Factorial factorial = new Factorial();
        factorial.calculateFactorial(7);
    }

    public void calculateFactorial(int n){
        int result  = 1;
        for(int i = n; i >= 1; i--) {
            result = result * i;
        }

        System.out.println("Factorial value: " + result);
    }
}
