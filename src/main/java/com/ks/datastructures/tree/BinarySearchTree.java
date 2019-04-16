package com.ks.datastructures.tree;

/**
 * @author 212350436
 */
public class BinarySearchTree {
    public class Node {
        private Node leftNode = null;
        private Node rightNode = null;
        private int data;

        public Node getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(Node leftNode) {
            this.leftNode = leftNode;
        }

        public Node getRightNode() {
            return rightNode;
        }

        public void setRightNode(Node rightNode) {
            this.rightNode = rightNode;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }

    private Node rootNode;

    public void insert(int value) {
        rootNode = insertRecord(rootNode, value);
    }

    private Node insertRecord(Node _parentNode, int value) {

        // If node is null create one
        if (_parentNode == null) {
            Node node = new Node();
            node.setData(value);
            return node;
        }

        if (_parentNode.getData() <= value) {
            _parentNode.leftNode = insertRecord(_parentNode.getLeftNode(), value);
        } else {
            _parentNode.rightNode = insertRecord(_parentNode.getRightNode(), value);
        }

        return _parentNode;

    }

    public void traverse() {
        traverseTree(rootNode);
    }

    private void traverseTree(Node node) {
        if (node == null) {
            return;
        }

        traverseTree(node.getLeftNode());
        System.out.print(node.data + "  ");
        traverseTree(node.getRightNode());
    }

    public void countNodes() {
        int numberOfNodes = countAllNodes(rootNode);
        System.out.println("Number of Nodes: " + numberOfNodes);
    }

    private int countAllNodes(Node node) {
        if (node == null) {
            return 0;
        }

        int count = 1;
        if (node.getLeftNode() != null) {
            count = count + countAllNodes(node.getLeftNode());
        } else if (node.getRightNode() != null) {
            count = count + countAllNodes(node.getRightNode());
        }

        return count;

    }

    public boolean search(int data) {
        return search(rootNode, data);
    }

    private boolean search(Node node, int data) {
        if (node == null) {
            return false;
        }

        if (node.getData() == data) {
            return true;
        }

        if (node.getLeftNode() != null) {
            return search(node.getLeftNode(), data);
        } else if (node.getRightNode() != null) {
            return search(node.getRightNode(), data);
        }

        return false;
    }

    private void preorder(Node node){
        if(node == null) {
            return;
        }
        System.out.println(node.getData());
        preorder(node.getLeftNode());
        preorder(node.getRightNode());
    }

    private void printPreOrder(){
        preorder(rootNode);
    }

    private void postorder(){

    }

    private void inorder(){

    }

    public static void main(String args[]) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(40);
        binarySearchTree.insert(78);
        binarySearchTree.insert(25);
        binarySearchTree.insert(32);
        binarySearchTree.insert(10);

        binarySearchTree.traverse();
        binarySearchTree.countNodes();
        System.out.println("Find the give data: " + binarySearchTree.search(18));

        System.out.println("Print preorder ");
        binarySearchTree.printPreOrder();
    }
}
