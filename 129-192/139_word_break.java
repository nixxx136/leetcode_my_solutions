public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // convert list to set
        Set<String> set = new HashSet<>(wordDict);
        
        // create dp array with size s.length() + 1
        boolean[] dp = new boolean[s.length()+1];
        dp[0]=true; // set dp[0] to be true
        
        // i iterate from 1 to s.length()
        for (int i=1; i<=s.length(); i++) {
            for (int j=0; j<i; j++) { // j iterate from 0 to i
                // if dp[j] is true, which means s.substring(0, j) is in the set
                // and s.substring(j, i) is also in the set
                // we set dp[i] to be true, which means s.substring(0, i) is in the set
                if (dp[j] && set.contains(s.substring(j, i))) { 
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}