package com.mohit.leetcode;

import com.google.gson.Gson;
import com.mohit.data_structures.Node;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateElementsFromList {
    public Node removeList(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node pre = dummy;


        while (head != null) {
            if (head.next != null && head.data == head.next.data) {
                while (head.next != null && head.data == head.next.data) {
                    head = head.next;
                }

                pre.next = head.next;
            }else {
                pre = pre.next;
            }

            head = head.next;
        }

        return dummy.next;
    }
}
