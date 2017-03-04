public class Solution {
    public int maxProfit(int[] prices) {
	// Kadane's Algorithm
	// https://en.wikipedia.org/wiki/Maximum_subarray_problem
        int maxSofar=0, maxCur=0;
        for (int i=1; i<prices.length; i++) {
            maxCur = Math.max(0, maxCur + prices[i] - prices[i-1]);
            maxSofar = Math.max(maxSofar, maxCur);
        }
        return maxSofar;
    }
}