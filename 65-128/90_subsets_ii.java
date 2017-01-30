public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // backtracking solution
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        backtracking(nums, 0, new LinkedList<>(), res);
        return res;
    }
    
    public void backtracking(int[] nums, int start, List<Integer> cur, List<List<Integer>> res) {
        res.add(new LinkedList<>(cur));
        for (int i=start; i<nums.length; i++) {
            if (i>start && nums[i]==nums[i-1]) continue; // skip the duplicate
            cur.add(nums[i]);
            backtracking(nums, i+1, cur, res);
            cur.remove(cur.size()-1);
        }
    }
}