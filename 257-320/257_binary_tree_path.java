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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new LinkedList<>();
        if (root==null) return res;
        StringBuilder sb = new StringBuilder();
        helper(root, sb, res);
        return res;
    }
    // backtrack solution
    public void helper(TreeNode root, StringBuilder path, List<String> res) {
        int tmp = path.length();
        if (root.left==null && root.right==null) {
            path.append(root.val);
            res.add(path.toString());
            return;
        }
        if (root.left!=null) {
            path.append(root.val + "->");
            helper(root.left, path, res);
            path = path.delete(tmp, path.length());
        }
        if (root.right!=null) {
            path.append(root.val + "->");
            helper(root.right, path, res);
            path = path.delete(tmp, path.length());
        }
    }
}