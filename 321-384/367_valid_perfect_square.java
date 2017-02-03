public class Solution {
    public boolean isPerfectSquare(int num) {
        // binary search method
        int lo=0, hi=num;
        while (lo<=hi) {
            long mid = (lo+hi)/2;
            if (mid*mid==num) return true;
            else if (mid*mid<num) {
                lo=(int)mid+1;
            } else {
                hi=(int)mid-1;
            }
        }
        return false;
    }
}