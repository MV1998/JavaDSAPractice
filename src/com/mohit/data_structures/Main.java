package com.mohit.data_structures;

import com.mohit.data_structures.Heap.MHeap;

public class Main {
    public static void main(String[] args) {

        MHeap mHeap = new MHeap(10);

        mHeap.insert(10);
        mHeap.insert(5);
        mHeap.insert(20);
        mHeap.insert(2);
        mHeap.insert(4);
        mHeap.insert(8);

        mHeap.buildHeap();

        System.out.println("bit"+ Integer.bitCount(-3));

        mHeap.showElement();
    }
}
