public class Solution {
    // O(n*n) solution
    public boolean find132pattern(int[] nums) {
        if (nums==null || nums.length<3) return false;
        int n = nums.length, min = Integer.MAX_VALUE;
        
        for (int j=0; j<n; j++) {
            min = Math.min(min, nums[j]);
            if (min>=nums[j]) continue;
            for (int k=n-1; k>j; k--) {
                if (min<nums[k] && nums[k]<nums[j]) return true;
            }
        }
        
        return false;
    }
}