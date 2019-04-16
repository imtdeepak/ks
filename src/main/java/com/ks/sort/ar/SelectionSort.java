package com.ks.sort.ar;

/**
 * @author 212350436
 */
public class SelectionSort {
    public void sort(int[] array){
        for(int i = 0; i < array.length; i++) {
            int minElem = array[i];
            int jPosition = -1;

            for(int j = i + 1; j < array.length; j++) {
                int currentElement = array[j];

                if(currentElement < minElem) {
                    minElem = currentElement;
                    jPosition = j;
                }
            }

            if(jPosition > -1){
                int temp = array[i];
                array[i] = minElem;
                array[jPosition] = temp;
            }

        }
    }
    public static void main(String args[]) {
        int[] array = new int[]{54, 26, 93, 17, 77, 31, 44, 55, 20, 32, 45, 67, 2, 7};

        new SelectionSort().sort(array);

        for(int a : array) {
            System.out.print(a + ",");
        }
    }
}
