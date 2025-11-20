package com.newsum.datastructures;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    static class Node<T> {
        T value;
        Node<T> prev;
        Node<T> next;
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        Node<Integer> node = new Node<>();
        node.value = 1;
        doublyLinkedList.head = node;
        node = new Node<>();
        node.value = 2;
        doublyLinkedList.head.next = node;
        node = new Node<>();
        node.value = 3;
        doublyLinkedList.head.next.next = node;

        printList(doublyLinkedList.head);
        sumList(doublyLinkedList.head);
    }

    private static void printList(Node<Integer> head) {
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }

    private static void sumList(Node<Integer> head) {
        int sum = 0;
        while (head != null) {
            sum += head.value;
            head = head.next;
        }
        System.out.println("Sum of values inside linked list: "+sum);
    }
}
