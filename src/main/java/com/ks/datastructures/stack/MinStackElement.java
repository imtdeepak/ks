package com.ks.datastructures.stack;

/**
 * @author Ahil
 */
public class MinStackElement<T>
{
    private int minElement;
    private Stack stack = new Stack();

    public static void main(String[] args)
    {
        MinStackElement minStackElement = new MinStackElement();
        minStackElement.push(10);
        minStackElement.push(9);
        minStackElement.push(6);
        System.out.println("Minimum value: " + minStackElement.getMinElement());
    }

    public void push(Integer object){
        int pushValue = object.intValue();
        if(stack.isEmpty()) {
            minElement = Integer.MAX_VALUE;
        }

        if(minElement >  pushValue)
        {
            minElement = pushValue;
        }
        stack.push(object);
    }

    public int getMinElement(){
        return minElement;
    }
}
