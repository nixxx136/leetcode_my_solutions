public class Solution {
    public void moveZeroes(int[] nums) {
        // if nums is null, empty or only have 1 element,
        // we do not have to modify it
        if (nums==null || nums.length<=1) return;
        
        int i=0;
        // iterate nums
        for (int num : nums) {
            // if num is not equal to 0
            // we put it into nums[i] then increase i
            if (num!=0) nums[i++]=num;
        }
        // for the rest of the nums, fill it with 0s
        while (i<nums.length) {
            nums[i++]=0;
        }
    }
}