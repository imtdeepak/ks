package com.ks.datastructures.linkedlist;

/**
 * @author 212350436
 */
public class FindNodeFaster<E> {
  private Node<E> head = null;

  public FindNodeFaster() {
    head = null;
  }

  public static void main(String args[]) {
    FindNodeFaster findNodeLinkedList = new FindNodeFaster();
    findNodeLinkedList.add(3);
    findNodeLinkedList.add(4);
    findNodeLinkedList.add(5);
    findNodeLinkedList.add(6);
    // findNodeLinkedList.add(7);

    findNodeLinkedList.traverse();

    findNodeLinkedList.findMiddleNode();
  }

  public void add(E data) {
    Node<E> temp = new Node(data);
    if (head == null) {
      head = temp;
    } else {
      Node current = head;
      while (current.getNext() != null) {
        // System.out.println(current.getData());
        current = current.getNext();
      }
      current.next = temp;
    }
  }

  public void findMiddleNode() {
    Node slowPointer = head;
    Node fastPointer = head;

    if (head != null) {
      while (fastPointer != null && fastPointer.getNext() != null) {
        slowPointer = slowPointer.getNext();
        fastPointer = fastPointer.getNext().getNext();
      }
      System.out.println("Middle value: " + slowPointer.getData());
    }
  }

  public void traverse() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.getData());
      temp = temp.getNext();
    }
  }

  private class Node<E> {
    Node<E> next;
    private E data;

    public Node(E _data) {
      this.data = _data;
    }

    public Node<E> getNext() {
      return next;
    }

    public void setNext(Node<E> next) {
      this.next = next;
    }

    public E getData() {
      return data;
    }

    public void setData(E data) {
      this.data = data;
    }
  }
}
