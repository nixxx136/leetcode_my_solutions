public class Solution {
    public int firstMissingPositive(int[] nums) {
        // compare with problem 268
        int countPos=0;
        Set<Integer> set = new HashSet<>();
        // find all positive and add them to set
        for (int i : nums) {
            if (i>0 && !set.contains(i)) {
                set.add(i);
                countPos++;
            }
        }
        // check which positive is missing
        for (int i=1; i<=countPos; i++) {
            if (!set.contains(i)) return i;
        }
        return countPos+1;
    }
}
