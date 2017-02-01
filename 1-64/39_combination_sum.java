public class Solution {
    // backtracking solution
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);
        backtracking(nums, target, 0, new LinkedList<>(), res);
        return res;
    }
    
    public void backtracking(int[] nums, int remain, int start, List<Integer> cur, List<List<Integer>> res) {
        if (remain<0) return;
        else if (remain==0) res.add(new LinkedList<>(cur));
        else {
            for (int i=start; i<nums.length; i++) {
                cur.add(nums[i]);
                backtracking(nums, remain-nums[i], i, cur, res);
                cur.remove(cur.size()-1);
            }
        }
    }
}