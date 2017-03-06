public class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        if (k==0) {
            Map<Integer, Integer> map = new HashMap<>();
            
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0)+1);
            }
            
            for (int key : map.keySet()) {
                int n = map.get(key);
                if (n>1) count += 1;
            }
            
        } else {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) set.add(num);
            
            int[] nn = new int[set.size()];
            int idx=0;
            for (int s : set) nn[idx++] = s;
            
            for (int i=0; i<set.size(); i++) {
                for (int j=i; j<set.size(); j++) {
                    if (Math.abs(nn[i]-nn[j])==k) count++;
                }
            }
        }
        return count;
    }
}