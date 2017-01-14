/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        // corner case
        if (head==null) return null;
        
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode cur = head;
        // create all node and initilze the label put them into map
        while (cur!=null) {
            RandomListNode tmp = new RandomListNode(cur.label);
            map.put(cur, tmp);
            cur = cur.next;
        }
        
        cur = head;
        // assign next, random of those new nodes
        while (cur!=null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        
        return map.get(head);
    }
}