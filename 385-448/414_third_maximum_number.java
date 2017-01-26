public class Solution {
    public int thirdMax(int[] nums) {
        // initialize first, second, third to be Integer.MIN_VALUE
        int first=Integer.MIN_VALUE, second=Integer.MIN_VALUE, third=Integer.MIN_VALUE;
        
        // iterate through int array nums
        for (int n : nums) {
            // first case: if n equals to one of those three values
            // skip it.
            if (n==first || n==second || n==third) {
                continue;
            } else if (first==Integer.MIN_VALUE || n>first) { 
                // second case: if n equals Integer.MIN_VALUE or greater that first
                // update first, second, third
                // if n equals Integer.MIN_VALUE, which means it has not been updated yet
                third=second;
                second=first;
                first=n;
            } else if (second==Integer.MIN_VALUE || n>second) {
                // third case: if n equals Integer.MIN_VALUE or greater that first
                // update second, third
                third=second;
                second=n;
            } else if (third==Integer.MIN_VALUE || n>third) {
                // fourth case: if n equals Integer.MIN_VALUE or greater that first
                // update third
                third=n;
            }
        }
        return third==Integer.MIN_VALUE ? first : third;
    }
}