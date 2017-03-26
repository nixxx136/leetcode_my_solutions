/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = head;
        ListNode pre = dummy;
        ListNode nxt = null;
        
        while (cur!=null) {
            nxt = cur.next; // update nxt
            // go through the first part of list from the beginning
            // find the right position of cur
            while (pre.next!=null && pre.next.val<cur.val) { 
                pre = pre.next;
            }
            // insert cur between pre and pre.next
            cur.next = pre.next;
            pre.next = cur;
            pre = dummy; // update pre to the beginning of the list
            cur = nxt; // update cur to the next;
        }
        return dummy.next;
    }
}