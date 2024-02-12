/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        if (lists.length == 1) return lists[0];
        ListNode result = null;
        ListNode tempResult = null;
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < lists.length; i++) {
            ListNode node = lists[i];
            while(node != null) {
                list.add(node.val);
                node = node.next;
            }
        }
        Collections.sort(list);
        for (int x : list) {
            if (result == null) {
                result = new ListNode(x);
                tempResult = result;
            }else {
                tempResult.next = new ListNode(x);
                tempResult = tempResult.next;
            }
        }
        return result;
    }

    public void merge(ListNode first, ListNode second, ListNode result) {
        ListNode tempFirst = first;
        ListNode tempSecond = second;
        ListNode tempResult = result;
        while(tempResult != null && tempResult.next != null) {
            tempResult = tempResult.next;
        }
        while (tempFirst != null && tempSecond != null) {
            ListNode node = null;
            if (tempFirst.val <= tempSecond.val) {
                 node = new ListNode(tempFirst.val);
                 tempFirst = tempFirst.next;
            }else {
                node = new ListNode(tempSecond.val);
                tempSecond = tempSecond.next;
            }
            if (result == null) {
                result = node;
                tempResult = node;
            }else{
                tempResult.next = node;
                tempResult = node;
            }
        }

        while (tempFirst != null) {
            ListNode node = new ListNode(tempFirst.val);
            if (result == null) {
                result = node;
            }else{
               tempResult.next = node;
               tempResult = node;
            }
            tempFirst = tempFirst.next;
        }

         while (tempSecond != null) {
           ListNode node = new ListNode(tempSecond.val);
            if (result == null) {
                result = node;
            }else{
                tempResult.next = node;
                tempResult = node;
            }
            tempSecond = tempSecond.next;
        }
    }
}
