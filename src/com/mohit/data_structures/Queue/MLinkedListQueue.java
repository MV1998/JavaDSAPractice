package com.mohit.data_structures.Queue;

import com.mohit.data_structures.Node;

public class MLinkedListQueue {
    public Node front, rear;
    public int size;

    public MLinkedListQueue() {
        this.size = 0;
        this.front = this.rear = null;
    }

    public void enqueue(int data) {
        Node node = new Node(data);

        this.size++;
        if (front == null) {
            front = rear = node;
        }
        rear.next = node;
        rear = node;
    }

    public void dequeue() {
        if (front == null) return;

        this.size--;
        front = front.next;

        if (front == null) rear = null;
    }

    public int getFront() {
        return front != null ? front.data : -1;
    }

    public int getRear() {
        return rear != null ? rear.data : -1;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int getSize() {
        return size;
    }
}
