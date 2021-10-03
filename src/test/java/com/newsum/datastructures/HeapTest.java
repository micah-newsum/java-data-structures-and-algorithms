package com.newsum.datastructures;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HeapTest {

    @Test
    void whenInsertThenHeapPropertyMaintained(){
        Heap heap = new Heap(10);
        heap.insert(1);
        assertThat(heap.isEmpty()).isFalse();
    }

    @Test
    void whenDeleteThenNodeDeleted(){
        Heap heap = new Heap(10);
        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);
        assertThat(heap.delete(5)).isEqualTo(40);
    }

    @Test
    void whenPeekThenValueReturned(){
        Heap heap = new Heap(10);
        heap.insert(1);
        assertThat(heap.peek()).isEqualTo(1);
    }
}
