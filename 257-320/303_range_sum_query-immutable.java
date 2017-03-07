public class NumArray {

    final int[] sumToHere;
    
    public NumArray(int[] nums) {
        if (nums==null || nums.length<1) {
            sumToHere=null;
        }
        int n = nums.length;
        sumToHere = new int[n];
        sumToHere[0] = nums[0];
        for (int i=1; i<n; i++) {
            sumToHere[i] = sumToHere[i-1]+nums[i];
        }
    }
    
    public int sumRange(int i, int j) {
        int start;
        if (i==0) start=0;
        else start=sumToHere[i-1];
        return sumToHere[j]-start;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */