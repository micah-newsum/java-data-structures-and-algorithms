package com.newsum.algorithms.linkedlists;

import com.newsum.datastructures.LinkedListNode;

public class Partition {
    /**
     * Partitions a linked list such all values less than x, appear before x.
     * @param node
     * @param x
     * @return
     */
    public static LinkedListNode partition(LinkedListNode node, int x){
        LinkedListNode head = node;
        LinkedListNode tail = node;

        while (node != null){
            LinkedListNode next = node.next;
            if (node.data < x){
                /* Insert node at head */
                node.next = head;
                head = node;
            } else {
                /* Insert node at tail */
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;

        // The head has changed, so we need to return it to the user.
        return head;
    }
}
