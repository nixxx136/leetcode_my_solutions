public class Solution {
    public int mySqrt(int x) {
        // binary method
        int lo=0, hi=x;
        long mid;
        
        while(lo<=hi) {
            mid = (hi+lo) / 2;
            if (mid*mid < x) lo = (int)mid+1;
            else if (mid*mid > x) hi = (int)mid-1;
            else return (int)mid;
        }
        return hi;
    }
}