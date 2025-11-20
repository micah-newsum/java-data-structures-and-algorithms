package com.newsum.datastructures;

public class LinkedListNode {
    public int data;
    public LinkedListNode next;

    public static void main(String[] args){
        LinkedListNode head = new LinkedListNode();
        LinkedListNode tail = new LinkedListNode();
        head.next = tail;
        head.data = 1;
        head.next.data = 2;
        // Traverse all nodes in list
        traverse(head);
    }

    public static void traverse(LinkedListNode node) {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }
}
