public class Solution {
    public int searchInsert(int[] nums, int target) {
        // binary search
        if (nums.length<1) return 0;
        int lo=0, hi=nums.length-1, mid;
        while (lo<=hi) {
            mid = (lo+hi) / 2;
            if (nums[mid]==target) return mid;
            else if (nums[mid]<target) lo=mid+1;
            else hi=mid-1;
        }
        return lo;
    }
}