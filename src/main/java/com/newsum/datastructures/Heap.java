package com.newsum.datastructures;

public class Heap {
 private int[] heap;
 private int size;

 public Heap(int capacity){
     heap = new int[capacity];
 }

 public boolean isFull(){
     return size == heap.length;
 }
}
