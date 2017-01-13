public class Solution {
    public String longestPalindrome(String s) {
        // DP solution from: http://articles.leetcode.com/longest-palindromic-substring-part-i
        
        // check edge cases
        if (s==null || s.length()<2) return s;
        
        char[] sc = s.toCharArray();
        int start=0, maxlen=0, n=sc.length;
        int[][] dp = new int[n][n];
        
        String res="";
        
        // base cases find all length of one or two palindrome
        // dp[i][i] = 1
        // dp[i][i+1] = 1 <- sc[i]==sc[i+1]
        for (int i=0; i<n; i++) {
            dp[i][i]=1;
            start=i;
            maxlen=1;
        }
        
        for (int i=0; i<n-1; i++) {
            if (sc[i]==sc[i+1]){
                dp[i][i+1]=1;
                start=i;
                maxlen=2;
            }
        }
        
        // expend and find all length>2 palindrome
        for (int len=3; len<=n; len++) { // iterate from length 3 to n
            for (int i=0; i<=n-len; i++) { // start index from i to n-len
                int j=i+len-1; // end index = start + end -1
                if (sc[i]==sc[j] && dp[i+1][j-1]==1) { // check if it is a palindrome
                    dp[i][j]=1;
                    maxlen=len;
                    start=i;
                }
            }
        }
        return s.substring(start, start+maxlen);
    }
}