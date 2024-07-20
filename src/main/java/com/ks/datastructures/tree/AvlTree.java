package com.ks.datastructures.tree;

/**
 * @author 212350436
 */
public class AvlTree {
    private Node root;

    public static void main(String args[]) {
        AvlTree avlTree = new AvlTree();
        avlTree.insert(10);
        avlTree.insert(20);
        avlTree.insert(30);
        avlTree.insert(40);
        avlTree.insert(50);
        avlTree.insert(25);
        avlTree.preOrder();
    }

    private int getBalanceFactor(Node node1, Node node2) {
        int balanceFactor = height(node1) - height(node2);
        return balanceFactor;
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    private int max(int a, int b) {
        int max = (a > b) ? a : b;
        return max;
    }

    public void insert(int data) {
        this.root = insert(root, data);
    }

    private Node insert(Node node, int data) {
        if (node == null) {
            Node newNode = new Node();
            newNode.setData(data);
            return newNode;
        }


        if (node.getData() > data) { // left
            node.leftChild = insert(node.leftChild, data);

            if (getBalanceFactor(node.leftChild, node.rightChild) == 2) {
                if (data < node.leftChild.getData()) {
                    node = rotateWithLeftChild(node);
                } else {
                    node = doubleWithLeftChild(node);
                }
            }
        } else if (node.getData() < data) { // right
            node.rightChild = insert(node.rightChild, data);

            if(getBalanceFactor(node.rightChild, node.leftChild) == 2 )
                if(data > node.rightChild.data)
                    node = rotateWithRightChild(node);
                else
                    node = doubleWithRightChild(node);
        }

        node.height = max(height(node.leftChild), height(node.rightChild)) + 1;
        return node;
    }

    private Node rotateWithLeftChild(Node c) {
        Node p = c.leftChild;
        c.leftChild = p.rightChild;
        p.rightChild = c;
        c.height = max(height(c.leftChild), height(c.rightChild)) + 1;
        p.height = max(height(p.leftChild), c.height) + 1;
        return p;
    }

    public Node doubleWithLeftChild(Node c) {

        Node tmp;

        c.leftChild = rotateWithRightChild(c.leftChild);
        tmp = rotateWithLeftChild(c);

        return tmp;

    }

    public Node rotateWithRightChild(Node c) {

        Node p;  // right child of c

        p = c.rightChild;
        c.rightChild = p.leftChild;
        p.leftChild = c;

        c.height = Math.max(height(c.leftChild), height(c.rightChild)) + 1;
        p.height = Math.max(height(p.leftChild), height(p.rightChild)) + 1;

        return p;

    }

    private Node doubleWithRightChild(Node c)
    {
        Node tmp;

        c.rightChild = rotateWithLeftChild(c.rightChild);
        tmp = rotateWithRightChild(c);

        return tmp;
    }

    void preOrder() {
        preOrder(root);
    }
    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }
    }

    class Node {
        private Node leftChild;
        private Node rightChild;
        private int height;
        private int data;

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }
}
