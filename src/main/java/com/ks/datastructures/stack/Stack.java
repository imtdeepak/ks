package com.ks.datastructures.stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author 212350436
 */
public class Stack implements Iterable<Object>{
    private Object objects[] = null;
    private int numberOfElements = 0;

    public Stack(){
        objects = new Object[2];
    }

    public Object pop(){
        if(isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        numberOfElements = numberOfElements - 1;
        Object object  = objects[numberOfElements];
        objects[numberOfElements] = null;

        // down size halves the underlying array when it is one-quarter full.
        if(numberOfElements > 0 && numberOfElements == objects.length / 4) {
            resize(objects.length / 2);
        }
        return object;
    }

    public Object peek(){
        if(isEmpty()) throw new NoSuchElementException("Stack is empty");
        return objects[numberOfElements - 1];
    }

    public void push(Object item){
        // resize double if the array is full
        if(numberOfElements == objects.length) {
            resize(2 * objects.length);
        }

        objects[numberOfElements] = item;
        numberOfElements++;
    }

    public boolean isEmpty(){
        return numberOfElements == 0;
    }

    public int size(){
        return numberOfElements;
    }

    private void resize(int capacity){
        //assert capacity >= numberOfElements;

        if(capacity > 0 && capacity >= numberOfElements) {
            Object[] tempObjects = new Object[capacity];

            for(int i = 0; i < numberOfElements; i++){
                tempObjects[i] = objects[i];
            }

            objects = tempObjects;
        }
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    public Iterator iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<Object> {

        private int i;

        public MyIterator(){
            i = numberOfElements - 1;
        }

        public boolean hasNext() {
            return i >= 0;
        }

        public Object next() {
            return objects[i--];
        }


        public void remove() {

        }
    }

    public static void main(String args[]) {
        Stack stack = new Stack();
        System.out.println("Is Stack Empty: : " + stack.isEmpty());

        stack.push(3);
        stack.push(4);
        stack.push(6);
        stack.push(7);

        System.out.println("Is Stack Empty: : " + stack.isEmpty());

        Iterator iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }

        System.out.println("\n Stack pop 1: " + stack.pop());
        System.out.println("Stack pop 2: " + stack.pop());
        System.out.println("Stack pop 3: " + stack.pop());
        System.out.println("Stack pop 4: " + stack.pop());

        stack.push(8);
        System.out.println("Stack peek 1: " + stack.peek());


    }
}
