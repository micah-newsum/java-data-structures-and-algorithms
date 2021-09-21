package com.newsum.algorithms.linkedlists;

import com.newsum.datastructures.LinkedListNode;
import org.junit.jupiter.api.Test;

public class PartitionTest {
    @Test
    void whenPartitionAllLesserValuesLeftOfGiven(){
        LinkedListNode node = buildLinkedList();
        Partition.partition(node,5);
    }

    private LinkedListNode buildLinkedList(){
        // 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 -> null
        LinkedListNode head = new LinkedListNode();
        head.data = 3;

        // 3
        LinkedListNode previous = head;
        LinkedListNode next = new LinkedListNode();
        next.data = 5;
        previous.next = next;

        // 3 -> 5
        previous = next;
        next = new LinkedListNode();
        next.data = 8;
        previous.next = next;

        // 3 -> 5 -> 8
        previous = next;
        next = new LinkedListNode();
        next.data = 5;
        previous.next = next;

        // 3 -> 5 -> 8 -> 5
        previous = next;
        next = new LinkedListNode();
        next.data = 10;
        previous.next = next;

        // 3 -> 5 -> 8 -> 5 -> 10
        previous = next;
        next = new LinkedListNode();
        next.data = 2;
        previous.next = next;

        // 3 -> 5 -> 8 -> 5 -> 10 -> 2
        previous = next;
        next = new LinkedListNode();
        next.data = 1;
        previous.next = next;
        next.next = null;

        // // 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 -> null
        return head;
    }
}
