package com.ks.datastructures.stack;

/**
 * @author Ahil
 */
public class MyQueueUsingStackImpl {
  Stack stack1 = new Stack();
  Stack stack2 = new Stack();

  // FIFO
  // LIFO

  public static void main(String[] args) {
    MyQueueUsingStackImpl myQueueUsingStack = new MyQueueUsingStackImpl();
    myQueueUsingStack.enque(10);
    myQueueUsingStack.enque(11);
    myQueueUsingStack.enque(12);
    myQueueUsingStack.enque(13);

    System.out.println("Data : " + myQueueUsingStack.deque());
  }

  public void enque(int data) {
    stack1.push(data);
  }

  public int deque() {
    while (!stack1.isEmpty()) {
      stack2.push(stack1.pop());
    }

    int data = 0;
    if (!stack2.isEmpty()) {
      return (Integer) stack2.pop();
    }

    return data;
  }
}
