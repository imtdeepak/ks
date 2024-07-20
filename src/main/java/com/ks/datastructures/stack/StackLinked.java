package com.ks.datastructures.stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author 212350436
 *     <p>Singly-linked list implementation
 */
public class StackLinked implements Iterable {
  private Node headNode = null;
  private Node currentNode = null;

  public static void main(String args[]) {
    StackLinked stackLinked = new StackLinked();
    System.out.println("Stack is empty: " + stackLinked.isEmpty());

    stackLinked.push(1);
    stackLinked.push(2);
    stackLinked.push(3);
    stackLinked.push(4);

    System.out.println("Stack is empty: " + stackLinked.isEmpty());
    System.out.println("Stack pop: " + stackLinked.pop());

    Iterator iterator = stackLinked.iterator();
    while (iterator.hasNext()) {
      System.out.print(((Node) iterator.next()).getValue() + ", ");
    }
  }

  public Iterator iterator() {
    return new MyIterator(headNode);
  }

  public void push(Object item) {
    Node node = new Node(item);
    if (headNode == null) {
      headNode = node;
      currentNode = headNode;
    } else {
      currentNode.nextNode = node;
      currentNode = node;
    }
  }

  public Object pop() {
    if (isEmpty()) throw new NoSuchElementException("Stack is empty");

    if (headNode != null) {
      for (Node node = headNode.nextNode; node != null; node = node.nextNode) {
        if (node.nextNode == null) {
          return node.getValue();
        }
      }
    }

    return null;
  }

  public Object peek() {
    return null;
  }

  public boolean isEmpty() {
    return headNode == null;
  }

  private class Node {
    private Node nextNode = null;
    private Object value = null;

    Node(Object value) {
      this.value = value;
    }

    public Node getNextNode() {
      return nextNode;
    }

    public void setNextNode(Node nextNode) {
      this.nextNode = nextNode;
    }

    public Object getValue() {
      return value;
    }

    public void setValue(Object value) {
      this.value = value;
    }
  }

  private class MyIterator implements Iterator {

    Node node = null;

    public MyIterator(Node _node) {
      node = _node;
    }

    public boolean hasNext() {
      return node != null;
    }

    public Object next() {
      Node currentNode = node;
      if (node != null) {
        node = node.getNextNode();
      }
      return currentNode;
    }

    public void remove() {
      throw new UnsupportedOperationException("Operation is not supported");
    }
  }
}
