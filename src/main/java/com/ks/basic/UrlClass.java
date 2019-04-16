package com.ks.basic;

/**
 * @author Ahil
 */
public class UrlClass
{
    public static void main(String args[]) {
        String input = "selva ku mar";
        char[] inputArray = input.toCharArray();

        int inputLength = input.length();

        int noOfspaces = 0;
        for(int i =0; i< inputLength; i++) {
            if(inputArray[i] == ' ') {
                ++noOfspaces;
            }
        }
        System.out.println("Space Count "+noOfspaces);

        int newLength = inputLength + (noOfspaces * 2);

        System.out.println("New Length : "+newLength);

        char[] resultArray = new char[newLength];

        int position = 0;
        int index = 0;

        while(position < newLength) {
            if(inputArray[position] != ' '){
                resultArray[index] = inputArray[position];
                position = position+1;
                index = index + 1;
            } else {
                resultArray[index] = '%';
                resultArray[index+1] = '2';
                resultArray[index+2] = '0';
                position = position+1;
                index = index + 3;
        }
        }
        System.out.println(resultArray.toString());

    }

}
