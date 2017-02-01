public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        // backtrack
        List<List<Integer>> res = new LinkedList<>();
        backtrack(k, 1, n, new LinkedList<>(), res);
        return res;
    }
    
    public void backtrack(int k, int start, int remain, List<Integer> cur, List<List<Integer>> res) {
        if (remain<0 || cur.size()>k) { // no solution
            return;
        } else if (remain==0 && cur.size()==k) { // solution found
            res.add(new LinkedList<>(cur));
        } else {
            for (int i=start; i<=9; i++) {
                cur.add(i);
                backtrack(k, i+1, remain-i, cur, res);
                cur.remove(cur.size()-1);
            }
        }
        
    }
}