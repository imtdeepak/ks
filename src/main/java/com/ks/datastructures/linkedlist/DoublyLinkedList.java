package com.ks.datastructures.linkedlist;

/**
 * @author 212350436
 */
public class DoublyLinkedList<E> {
    private class Node {
        Node previous;
        Node next;
        E data;

        public Node(E value) {
            this.data = value;
        }

        public Node(E element, Node next, Node previous){
            this.data = element;
            this.next = next;
            this.previous = previous;
        }
        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }
    }

    private Node headNode;
    private Node tailNode;

    public DoublyLinkedList() {
        headNode = null;
        tailNode = null;
    }

    public void addFirst(E data) {
        Node tempNode = new Node(data, headNode, null);

        if(headNode == null) {
            headNode = tempNode;
        } else {
            headNode.previous = tempNode;
            headNode = tempNode;
        }

        if(tailNode == null) {
            tailNode = tempNode;
        }

    }

    public void addLast(E data){
        //Node tempNode = new Node(data, null, tailNode);

        Node tmp = new Node(data, null, tailNode);
        if(tailNode != null) {
            tailNode.next = tmp;
        }
        tailNode = tmp;
        if(headNode == null) { headNode = tmp;}
    }


    public void add(E data) {
        addFirst(data);
    }

    public void traverseForward() {
        Node currentNode = headNode;
        while(currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.next;
        }
    }

    public void traverseBackward(){
        Node tempNode = tailNode;
        while(tempNode != null) {
            System.out.println(tempNode.getData());
            tempNode = tempNode.previous;
        }
    }

    public boolean removeFirst(){
        boolean headElementRemoved = false;
        if(headNode != null) {
            headNode = headNode.next;

            if (headNode != null) {
                headNode.setPrevious(null);
            } else {
                tailNode = null;
            }

            headElementRemoved = true;
        }
        return headElementRemoved;
    }

    public boolean removeLast() {
        boolean lastElementRemoved = false;

        if(tailNode != null) {
            tailNode = tailNode.getPrevious();

            if(tailNode != null) {
                tailNode.setNext(null);
            } else {
                headNode = null;
            }

            lastElementRemoved = true;
        }

        return lastElementRemoved;
    }


    public static void main(String args[]) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.addFirst(3);
        doublyLinkedList.addFirst(4);
        doublyLinkedList.addLast(6);
        doublyLinkedList.addLast(7);

        doublyLinkedList.traverseForward();

        System.out.println("****************Traverse in reverse direction********************************************");

        doublyLinkedList.traverseBackward();

        System.out.println("Remove first element: " + doublyLinkedList.removeFirst());
        System.out.println("Remove first element: " + doublyLinkedList.removeFirst());
        doublyLinkedList.traverseForward();


        doublyLinkedList.addFirst(33);
        doublyLinkedList.addFirst(44);
        doublyLinkedList.addLast(66);
        doublyLinkedList.addLast(77);
        System.out.println("Remove last element: " + doublyLinkedList.removeLast());
        System.out.println("Remove last element: " + doublyLinkedList.removeLast());
        doublyLinkedList.traverseForward();
    }
}
