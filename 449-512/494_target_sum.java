public class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        // sum(P) - sum(Q) = S --- add sum(P) + sum(Q) to both sides
        // sum(P) + sum(Q) + sum(P) - sum(Q) = S + sum(P) + sum(Q)
        // 2 * sum(P) = S + sum(nums[])
        // sum(P) = (S + sum(nums[])) / 2
        // problems becomes find a subset P, which sum equals (S + sum(nums[])) / 2
        
        int sum=0;
        for (int n : nums) sum+=n;
        return S>sum || (S+sum)%2==1 ? 0 : solve(nums, (S+sum)>>1);
    }
    
    // DP method to solve subset problem
    public int solve(int[] nums, int s) {
        // creat a dp array with length s+1
        int[] dp = new int[s+1];
        dp[0] = 1; // initialize index 0 to be 1
        for (int n : nums) { // for each number in nums
            // i backword from s to n
            for (int i=s; i>=n; i--) {
                // increase dp[i] with dp[i-n] (cause i-n + n == i, we are iterating for n now)
                dp[i] += dp[i-n];
            }
        }
        return dp[s];
    }
}