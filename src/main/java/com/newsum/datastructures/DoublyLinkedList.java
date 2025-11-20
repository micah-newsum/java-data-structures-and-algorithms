package com.newsum.datastructures;

public class DoublyLinkedList {
    public Node head;
    public Node tail;

    static class Node {
        int value;
        Node prev;
        Node next;
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Node node = new Node();
        node.value = 1;
        doublyLinkedList.head = node;
        node = new Node();
        node.value = 2;
        doublyLinkedList.head.next = node;
        node = new Node();
        node.value = 3;
        doublyLinkedList.head.next.next = node;

        printList(doublyLinkedList.head);
        sumList(doublyLinkedList.head);
    }

    private static void printList(Node head) {
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }

    private static void sumList(Node head) {
        int sum = 0;
        while (head != null) {
            sum += head.value;
            head = head.next;
        }
        System.out.println("Sum of values inside linked list: "+sum);
    }
}
