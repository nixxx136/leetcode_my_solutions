public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        // backtrack solution
        List<List<Integer>> res = new LinkedList<>();
        backtrack(n, k, 1, new LinkedList<>(), res);
        return res;
    }
    
    public void backtrack(int n, int k, int start, List<Integer> cur, List<List<Integer>> res) {
        if (cur.size()==k) {
            res.add(new LinkedList<>(cur));
            return;
        }
        else {
            for (int i=start; i<=n; i++) {
                cur.add(i);
                backtrack(n, k, i+1, cur, res);
                cur.remove(cur.size()-1);
            }
        }
        
    }
}