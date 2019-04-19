package com.ks.ds;

/**
 * Created by deepak on 4/18/19.
 */
public class MyQueue<T> {
   private  int first;
    private int last;

    public int getSize() {
        return size;
    }

    private int size;

    public Object[] getElements() {
        return elements;
    }

    private Object[] elements;

    public int getFirst() {
        return first;
    }
    public int getLast() {
        return last;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public MyQueue(){


        this.size=10;//default size
        new MyQueue(this.size);
    }

    public MyQueue(int size){

        this.size=size;//default size
        this.first=0;
        this.last=0;
        this.elements=(T[]) new Object[this.size];
    }

    public void enqueue(T element){
        elements[last++]=element;
    }

    public Object dequeue(){
       return elements[first++];
    }

}
