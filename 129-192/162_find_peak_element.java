public class Solution {
    public int findPeakElement(int[] nums) {
        // binary search method
        int begin=0, end=nums.length-1, mid1, mid2;
        while (begin < end) {
            // only need to compare the mid two elements
            // check if they are increasing or decreasing
            mid1 = (begin + end) / 2;
            mid2 = mid1 +1;
            //System.out.println(begin + " " + end + " " + mid1 + " " + mid2);
            if (nums[mid1] < nums[mid2]) begin=mid2;
            else end=mid1;
            //System.out.println(begin + " " + end + " " + mid1 + " " + mid2);
        }
        return begin;
    }
}