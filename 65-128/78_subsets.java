public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // for each loop solution
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        
        res.add(new LinkedList<>());
        
        for (int n : nums) {
            List<List<Integer>> add = new LinkedList<>();
            for (List<Integer> ls : res) {
                List<Integer> tmp = new LinkedList<>(ls);
                tmp.add(n);
                add.add(tmp);
            }
            res.addAll(add);
        }
        return res;
    }
}