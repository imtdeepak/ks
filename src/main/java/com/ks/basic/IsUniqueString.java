package com.ks.basic;

import java.util.Scanner;

/**
 * @author Ahil
 */
public class IsUniqueString
{

    public static void main(String args[]) {

         String input = new IsUniqueString().getInput();
        boolean flag = new IsUniqueString().isUniqueBit(input);
        System.out.println(flag);
    }

    //Get Input
    private String getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input");


        return scan.next();
    }


    //To find if string has unique elements
    private boolean isUnique(String inputString){

        boolean flag[] = new boolean[128];
        for(int counter = 0; counter < inputString.length(); counter++) {
            int position = inputString.charAt(counter);

            if(flag[position])
            {
                return false;
            }
            flag[position] = true;

        }

        return true;
    }

    private boolean isUniqueBit(String inputString) {
        int checker = 0;
        for(int counter = 0; counter < inputString.length(); counter++) {
            int val = inputString.charAt(counter) - 'a';
            if((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
            System.out.println("checker "+Integer.toBinaryString(checker));

        }
        return true;

    }

}
