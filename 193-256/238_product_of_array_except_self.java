public class Solution {
    public int[] productExceptSelf(int[] nums) {
        // explaination: http://stackoverflow.com/questions/2680548/given-an-array-of-numbers-return-array-of-products-of-all-other-numbers-no-div/2696005#2696005
        int[] product1 = new int[nums.length];
        int[] product2 = new int[nums.length];
        product1[0] = 1;
        product2[nums.length-1] = 1;
        for (int i=1; i<nums.length; i++) {
            product1[i] = product1[i-1]*nums[i-1];
            product2[nums.length-i-1] = product2[nums.length-i]*nums[nums.length-i];
	}
        for (int i=0; i<nums.length; i++) nums[i] = product1[i] * product2[i];
        return nums;
    }
}