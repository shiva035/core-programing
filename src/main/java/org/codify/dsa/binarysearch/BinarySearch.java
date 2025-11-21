package org.codify.dsa.binarysearch;

public class BinarySearch {
    private  Node root;

    public void insert(int data){
        root = createBTree(root, data);
    }

    private Node createBTree(Node root, int data) {
        if(root == null){
            return new Node(data);
        } else if(data < root.data){ // left tree
            root.left = createBTree(root.left, data);
        }else {  //right tree
            root.right = createBTree(root.right, data);
        }
        return root;
    }

    public void viewTree(){
        printBTreeInOrder(root);
    }

    private void printBTreeInOrder(Node root) {
        if(root != null){
            printBTreeInOrder(root.left);
            System.out.print(root.data + " ");
            printBTreeInOrder(root.right);
        }

    }


    public static void main(String[] args) {
        int[] arr = {8,5,7,6,4,3,1,2,9};
        BinarySearch btree = new BinarySearch();
        for (int k: arr){
            btree.insert(k);
        }
        btree.viewTree();
    }
}
