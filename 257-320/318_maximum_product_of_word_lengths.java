public class Solution {
    public int maxProduct(String[] words) {
        if (words==null || words.length==0) return 0;
        int res = 0, n = words.length;
        int[] mem = new int[n];
        for (int i=0; i<n; i++) {
            String tmp = words[i];
            for (int j=0; j<tmp.length(); j++) {
                mem[i] |= 1<<(tmp.charAt(j)-'a');
            }
        }
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if ( (mem[i]&mem[j]) == 0 ) {
                    res = Math.max(res, words[i].length() * words[j].length());
                }
            }
        }
        
        return res;
        
    }
}