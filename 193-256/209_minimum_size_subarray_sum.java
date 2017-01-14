public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        
        // edge cases
        if (nums==null || nums.length==0) return 0;
        
        // two pointers, first is the first pointer, last is the second pointer
        int first=0, last=0, min=Integer.MAX_VALUE, sum=0;
        
        // go through the nums array
        while (first<nums.length) {
            sum += nums[first++]; // add first to sums and increase the first
            
            while (sum>=s) { // while sum >= s, go into the loop
                min = Math.min(min, first-last);
                sum -= nums[last++];
            }
        }
        return min==Integer.MAX_VALUE ? 0 : min;
    }
}