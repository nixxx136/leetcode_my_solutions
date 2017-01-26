public class Solution {
    public int thirdMax(int[] nums) {
        // initialize first, second, third to be null
        Integer first=null, second=null, third=null;
        
        // iterate through int array nums
        for (Integer n : nums) {
            // first case: if n equals to one of those three values
            // skip it.
            if (n.equals(first) || n.equals(second) || n.equals(third)) {
                continue;
            } else if (first==null || n>first) { 
                // second case: if n equals null or greater that first
                // update first, second, third
                // if n equals null, which means it has not been updated yet
                third=second;
                second=first;
                first=n;
            } else if (second==null || n>second) {
                // third case: if n equals null or greater that first
                // update second, third
                third=second;
                second=n;
            } else if (third==null || n>third) {
                // fourth case: if n equals null or greater that first
                // update third
                third=n;
            }
        }
        return third==null ? first : third;
    }
}