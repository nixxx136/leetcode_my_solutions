public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<k && i<nums.length; i++) {
            if (!set.contains(nums[i])) set.add(nums[i]);
            else return true;
        }
        
        for (int i=k; i<nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                set.remove(nums[i-k]);
            } else {
                return true;
            }
        }
        return false;
    }
}