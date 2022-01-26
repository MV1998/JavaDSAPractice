package com.mohit.data_structures.Queue;

public class MQueue {
    int size, cap;
    int[] arr;

    public MQueue(int capacity) {
        this.cap = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getFront() {
        if (isEmpty()) {
            return  -1;
        }
        return arr[0];
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return size-1 >-1 ? arr[size-1] : -1;
    }

    public boolean isFull() {
        return size == cap;
    }

    public void enqueue(int x) {
        if (isFull()) return;
        arr[size] = x;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) return;
        for (int i = 0; i < size; i++) {
            arr[i] = arr[i+1];
        }
        size--;
    }
}
