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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new LinkedList<>();
        if (root==null) return res;
        backtrack(root, sum, new LinkedList<>(), res);
        return res;
    }
    
    public void backtrack(TreeNode root, int remain, List<Integer> cur, List<List<Integer>> res) {
        if (root.left==null && root.right==null && remain == root.val) {
            cur.add(root.val);
            res.add(new LinkedList<>(cur));
            return;
        }
        cur.add(root.val);
        if (root.left!=null) {
            backtrack(root.left, remain-root.val, cur, res);
            cur.remove(cur.size()-1);
        }
        if (root.right!=null) {
            backtrack(root.right, remain-root.val, cur, res);
            cur.remove(cur.size()-1);
        }
        if (root.left==null && root.right==null) return;
    }
}