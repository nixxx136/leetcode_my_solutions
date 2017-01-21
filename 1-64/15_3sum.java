public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // sort it first, then iterate it and use two pointers to find the other two
        
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        
        Arrays.sort(nums);
        int n=nums.length, i, j, k;
        for (i=0; i<n-2; i++) {
            if (i>0 && nums[i]==nums[i-1]) continue; // skip same result
            j = i+1;
            k = n-1;
            while (j<k) {
                if (nums[i]+nums[j]==-nums[k]) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    // move pointer
                    j++;
                    k--;
                    // compare cur pointer with ther previous pointer value
                    while (j<k && nums[j]==nums[j-1]) j++; // skip same result
                    while (j<k && nums[k]==nums[k+1]) k--; // skip same result
                } else if (nums[i]+nums[j]<-nums[k]) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return res;
    }
}