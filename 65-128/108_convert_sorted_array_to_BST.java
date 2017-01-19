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
    // code source: https://discuss.leetcode.com/topic/3158/my-accepted-java-solution/2
    // idea: find the middle node and inorder traverse to creat the tree
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums==null) return null;
        return construct(nums, 0, nums.length-1);
    }
    
    public TreeNode construct(int[] nums, int low, int high) {
        if (low>high) return null;
        int mid = (low+high) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = construct(nums, low, mid-1);
        root.right = construct(nums, mid+1, high);
        return root;
    }
}