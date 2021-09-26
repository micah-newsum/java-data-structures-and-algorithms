package com.newsum.datastructures;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HeapTest {

    @Test
    void whenInsertThenHeapPropertyMaintained(){
        Heap heap = new Heap(10);
        heap.insert(1);
        heap.insert(2);
        heap.insert(3);
        assertThat(heap.peek()).isEqualTo(3);
    }
}
