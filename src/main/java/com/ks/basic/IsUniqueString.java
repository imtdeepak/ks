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
        System.out.println("Unique characters Flag=" +flag);
        
        System.out.println(countUniqueCharacters(input));
        System.out.println("Total Length="+input.length());
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
    
    public static int countUniqueCharacters(String input) {
        boolean[] isItThere = new boolean[Character.MAX_VALUE];
        for (int i = 0; i < input.length(); i++) {
            isItThere[input.charAt(i)] = true;
        }

        int count = 0;
        for (int i = 0; i < isItThere.length; i++) {
            if (isItThere[i] == true){
                count++;
            }
        }

        return count;
    }

}
