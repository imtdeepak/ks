package com.ks.datastructures.linkedlist;


/**
 * @author 212350436
 */
public class SinglyLinkedList<E extends Comparable> {

    private Node head;

    public SinglyLinkedList(){
        head = null;
    }

    public static void main(String args[]) {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
        singlyLinkedList.add(3);
        singlyLinkedList.add(4);
        singlyLinkedList.add(5);

        singlyLinkedList.addFirst(15);
        singlyLinkedList.addLast(20);

        singlyLinkedList.traverse();

        singlyLinkedList.remove(4);
        System.out.println("*******************************");
        singlyLinkedList.traverse();
    }

    public void add(E value){
        Node tempNode = new Node(value);
        if(head == null) {
            head = tempNode;
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }

            currentNode.setNext(tempNode);
        }
    }

    public void addFirst(E value){
        Node node = new Node(value);
        node.setNext(head);
        head = node;
    }

    public void addLast(E value) {
        add(value);
    }

    public boolean remove(E value) {
        boolean valueRemoved = false;
        Node tempNode = new Node(value);
        if (head != null) {
            Node currentNode = head;
            Node previousNode = head;
            while (currentNode.getNext() != null) {

                if (currentNode.getValue().equals(value)){
                    previousNode.setNext(currentNode.getNext());
                    valueRemoved = true;
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
        }
        return valueRemoved;
    }

    public void traverse(){
        if(head != null) {
            Node current = head;
            while(current != null) {
                System.out.println("Value: " + current.getValue());
                current = current.getNext();
            }
        }
    }

    private class Node<T> {
        private T value;
        private Node next;

        public Node(T value){
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
