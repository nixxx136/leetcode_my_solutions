/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null || headB==null) return null;
        
        ListNode a = headA;
        ListNode b = headB;
        
        while (a!=b) {
            a = a==null ? headB : a.next;
            b = b==null ? headA : b.next;
        } 
        // if there is no intersection, a and b will become to null at the same time
        // after a and b iterate two list, so they will equal at null
        return b;
    }
}