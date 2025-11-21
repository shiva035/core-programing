package org.codify.dsa.linklist;

public class LinkedListDemo {
    LinkedNode root;

    public LinkedListDemo(){
        root = null;
    }

    public void insert(int data){
        root = insertData(root, data);
    }

    public LinkedNode insertData(LinkedNode root, int data){
        if(root == null){
            return  new LinkedNode(data);
        }else {
            root.next = insertData(root.next, data);
        }
        return root;
    }

    public void print(){
        printData(root);
    }

    private void printData(LinkedNode root) {
        if(root != null) {
            System.out.print(root.data);
            printData(root.next);
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,5,7,6,4,3,1,2,9};
        LinkedListDemo linkedNode = new LinkedListDemo();
        for (int k: arr) linkedNode.insert(k);

        linkedNode.print();
    }
}
