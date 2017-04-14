/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int countNodes(TreeNode root) {
        int count=0, h=height(root);
        while (root!=null) {
            if (height(root.right)==h-1) {
                h--;
                count += (1<<h);
                root = root.right;
            } else {
                h--;
                count += (1<<h-1);
                root = root.left;
            }
        }
        return count;
    }
    
    public int height(TreeNode root) {
        if (root==null) return 0;
        return 1 + height(root.left);
    }
}