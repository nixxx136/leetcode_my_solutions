public class Solution {
    public int maxProfit(int[] prices) {
        // basically, need to calculate how many increase differnece
        if (prices==null || prices.length<2) return 0;
        int sum=0;
        for (int i=1; i<prices.length; i++) {
            sum += prices[i]-prices[i-1] > 0 ? prices[i]-prices[i-1] : 0;
        }
        return sum;
    }
}