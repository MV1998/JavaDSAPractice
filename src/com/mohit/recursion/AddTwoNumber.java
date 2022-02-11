package com.mohit.recursion;

import com.mohit.data_structures.Node;

public class AddTwoNumber {
    public Node addNumber(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node temp = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;
            Node newNode = new Node(sum %10);
            temp.next = newNode;
            temp = temp.next;
        }
        return  dummy.next;
    }
}
