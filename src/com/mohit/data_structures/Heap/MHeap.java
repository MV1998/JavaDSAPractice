package com.mohit.data_structures.Heap;

enum Heap {
    MIN, MAX
}

public class MHeap {

    int size;
    int capacity;
    int[] arr;

    public MHeap(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }


    public int left(int i) {return 2 * i + 1;}
    public int right(int i) {return 2 * i + 2;}
    public int parent(int i) {return ( i - 1 ) / 2;}

    public void insert(int number) {
        if (capacity != size) {
            size++;
            arr[size - 1] = number;
            minHeapify(size - 1);
        }else{
            System.out.println("Heap is fulled");
        }
    }

    public void minHeapify(int index) {
        for (int i = index; i != 0 && arr[parent(i)] > arr[i]; i = parent(i)) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
        }
    }

    public void minHeapifyWithIndex(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;

        if (l < size && arr[l] < arr[i]) {
            smallest = l;
        }

        if (r < size && arr[r] < arr[smallest]) {
            smallest = r;
        }

        if (smallest != i) {
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
            minHeapifyWithIndex(smallest);
        }

    }

    public void showElement() {
        for (int x = 0; x < size; x++) {
            System.out.print(" "+ arr[x]);
        }
    }

    public int extractMin() {
        if (size == 0) return Integer.MAX_VALUE;
        if (size == 1) {
            size--;
            return arr[size];
        }
        int temp = arr[0];
        arr[0] = arr[size - 1];
        arr[size - 1] = temp;
        size--;
        minHeapifyWithIndex(0);
        return arr[size];
    }

    public void decreaseKey(int i, int number) {
        if (i < size) {
            arr[i] = number;
            minHeapify(i);
        }
    }

    public void deleteKey(int i) {
        decreaseKey(i, Integer.MIN_VALUE);
        extractMin();
    }

    public void buildHeap() {
        for (int i = (size - 2)/2; i >= 0; i--) {
            minHeapifyWithIndex(i);
        }
    }
}
