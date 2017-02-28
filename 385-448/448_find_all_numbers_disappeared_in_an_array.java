public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // without using extra space
        List<Integer> res = new LinkedList<>();
        
        // basic idea is to conver i in nums to index
        // then change number at those index into negative
        for (int i=0; i<nums.length; i++) {
            int idx = Math.abs(nums[i])-1;
            if (nums[idx]>0) {
                nums[idx] = -nums[idx];
            }
        }
        
        for (int i=0; i<nums.length; i++) {
            if (nums[i]>0) res.add(i+1);
        }
        
        return res;
    }
}