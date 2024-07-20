package com.ks.ds.dsuser;

import com.ks.ds.MyQueue;

/** Created by deepak on 4/18/19. */
public class MyQueueUser {

  public static void main(String[] args) {
    MyQueue<Integer> myQueue = new MyQueue<Integer>(10);
    myQueue.enqueue(10);
    myQueue.enqueue(20);
    myQueue.enqueue(30);

    System.out.println(myQueue.getSize());
    System.out.println(myQueue.getFirst());
    System.out.println(myQueue.getLast());

    for (int i = myQueue.getFirst(); i < myQueue.getLast(); i++) {
      System.out.println(myQueue.getElements()[i]);
    }

    System.out.println(myQueue.dequeue());

    System.out.println("After Deque");
    System.out.println(myQueue.getSize());
    System.out.println(myQueue.getFirst());
    System.out.println(myQueue.getLast());

    for (int i = myQueue.getFirst(); i < myQueue.getLast(); i++) {
      System.out.println(myQueue.getElements()[i]);
    }
  }
}
