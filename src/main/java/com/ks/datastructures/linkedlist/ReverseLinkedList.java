package com.ks.datastructures.linkedlist;

/**
 * @author 212350436
 */
public class ReverseLinkedList<E> {
  private Node<E> head = null;

  public ReverseLinkedList() {
    head = null;
  }

  public static void main(String args[]) {
    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
    reverseLinkedList.add(3);
    reverseLinkedList.add(4);
    reverseLinkedList.add(5);
    reverseLinkedList.add(6);

    reverseLinkedList.traverse();
    System.out.println("Reverse the linked list");
    reverseLinkedList.reverseLinkedList();
    reverseLinkedList.traverse();
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

  public void reverseLinkedList() {
    if (head == null) return;
    else {
      Node current = head;
      Node next = null;
      Node previous = null;
      while (current != null) {
        next = current.getNext();
        current.setNext(previous);
        previous = current;
        current = next;
      }
      // current.setNext(null);
      head = previous;
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
