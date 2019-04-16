package com.ks.basic;

/**
 * @author 212350436
 */
public class Factorial {

    public void calculateFactorial(int n){
        int result  = 1;
        for(int i = n; i >= 1; i--) {
            result = result * i;
        }

        System.out.println("Factorial value: " + result);
    }

    public static void main(String args[]) {
        Factorial factorial = new Factorial();
        factorial.calculateFactorial(7);
    }
}
