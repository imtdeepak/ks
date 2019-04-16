package com.ks.datastructures.stack;

/**
 * @author Ahil
 */
public class SortStack
{

    public static void main(String[] args)
    {
        // Add elements to it
        Stack unsortedStack = new Stack();
        unsortedStack.push(15);
        unsortedStack.push(10);
        unsortedStack.push(17);
        unsortedStack.push(12);
        unsortedStack.push(9);

        // sort the elements using a another unsortedStack...
        Stack sortedStack = new Stack();
        int unsortedStackSize = unsortedStack.size();
        for(int k=0; k < unsortedStackSize; k++) {
            int unsortedData = (Integer) unsortedStack.pop();

            // before putting the data in the correct position pop the lesser data and put it in unsorted
            int sortedStackSize = sortedStack.size();
            int popCounter = 0;

            if(sortedStackSize > 0)
            {
                for (int i = 0; (i < sortedStackSize && (Integer) sortedStack.peek() < unsortedData); i++)
                {

                    Integer existSortedData = (Integer) sortedStack.pop();
                    unsortedStack.push(existSortedData);
                    popCounter++;

                }
            }

            sortedStack.push(unsortedData);

            // pop the data back from unsorted sort and put in  sorted stack
            for(int l=0; l < popCounter; l++) {
                int originalSortData = (Integer) unsortedStack.pop();
                sortedStack.push(originalSortData);
            }
        }

        for(Object m : sortedStack){
            System.out.println((Integer) m);
        }
    }
}
