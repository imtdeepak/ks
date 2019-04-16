package com.ks.dynamicprob;

/**
 * @author Ahil
 */
public class CoinChange
{
    private int makeChange(int amount) {
        int[] denoms = {10, 5, 1};
        return makeChange(amount, denoms, 0);
    }
    private int makeChange(int amount, int[] denoms, int index){
        if(index >= denoms.length - 1 ) return 1;
        int  ways = 0;
        int denomAmount = denoms[index];

        for(int i = 0; i * denomAmount <= amount; i++) {
            int amountRemaining = amount - i * denomAmount;
            System.out.println(amount + ", " + index + ", " + denoms[index] + ", " + ways+", "+amountRemaining);

            ways += makeChange(amountRemaining, denoms, index + 1);
        }
        return ways;
    }
    public static void main(String[] args)
    {
        CoinChange coinChange = new CoinChange();
        System.out.println(coinChange.makeChange(15));
    }
}
