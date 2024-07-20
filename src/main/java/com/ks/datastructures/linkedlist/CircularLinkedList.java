package com.ks.datastructures.linkedlist;

/**
 * @author 212350436
 */
public class CircularLinkedList<E> {

  private Node head;

  public CircularLinkedList() {
    head = null;
  }

  public static void main(String args[]) {
    CircularLinkedList circularLinkedList = new CircularLinkedList();
    circularLinkedList.addFirst(6);
    circularLinkedList.addFirst(5);
    circularLinkedList.addFirst(7);

    circularLinkedList.traverse();
  }

  public void addFirst(E data) {
    Node tempNode = new Node(data);
    if (head == null) {
      tempNode.next = tempNode;
    } else {
      Node tp = head;
      while (tp.next != head) {
        tp = tp.next;
      }
      tp.next = tempNode;
      tempNode.next = head;
    }
    head = tempNode;
  }

  private Node<E> getTail() {
    Node<E> tailNode = head;
    if (head == null) {
      return null;
    } else {
      // System.out.println(head.getData());
      Node temp = head;

      while (temp.next != head) {
        // System.out.println(temp.getData());
        temp = temp.getNext();
      }
      tailNode = temp;
    }
    return tailNode;
  }

  public void traverse() {
    // 7 5 6
    if (head != null) {
      // System.out.println(head.getData());
      Node temp = head;

      while (temp.getNext() != head) {
        System.out.println(temp.getData());
        temp = temp.getNext();
      }
      System.out.println(temp.getData());
    }
  }

  private class Node<E> {
    E data;
    private Node<E> next;

    public Node(E data) {
      this.data = data;
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
