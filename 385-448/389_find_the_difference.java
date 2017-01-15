public class Solution {
    public char findTheDifference(String s, String t) {
	// Basic idea for this problem is to add all the char in t,
	// delete all the char in s, then the last will be the extra one.

	// Instead of using add operator, I use XOR here. The reason is,
	// when you apply XOR on one char twice, then you will get an 0.
	int ret = 0;
	
        for (char ch : s.toCharArray()) ret ^= ch;
        for (char ch : t.toCharArray()) ret ^= ch;
        
        return (char)ret;
    }
}
