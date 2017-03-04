/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // fast-slow method
        // Good explanation: http://fisherlei.blogspot.com/2013/11/leetcode-linked-list-cycle-ii-solution.html
        if (head==null || head.next==null) return null;
        ListNode fast=head, slow=head;
        while (fast.next!=null && fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast==slow) {
                while (head!=slow) {
                    head = head.next;
                    slow = slow.next;
                }
                return head;
            }
        }
        return null;
    }
}