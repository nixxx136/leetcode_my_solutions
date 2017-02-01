public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        // backtrack solution
        // basically, try to construct all possible set with length<nums.length
        // skip duplicate
        // then find those satisfy solutions
        List<List<Integer>> res = new LinkedList<>();
        backtrack(nums, new LinkedList<>(), res);
        return res;
    }
    
    public void backtrack(int[] nums, LinkedList<Integer> cur, List<List<Integer>> res) {
        if (cur.size()>nums.length) return;
        else if (cur.size()==nums.length) res.add(new LinkedList<Integer>(cur));
        else {
            for (int i=0; i<nums.length; i++) {
                if (cur.contains(nums[i])) continue; // if cur contains nums[i] continue
                cur.add(nums[i]);
                backtrack(nums, cur, res);
                cur.remove(cur.size()-1);
            }
        }
        
    }
}