public class Solution {
    public char findTheDifference(String s, String t) {
        int ret = 0;
        
        for (char ch : s.toCharArray()) ret ^= ch;
        for (char ch : t.toCharArray()) ret ^= ch;
        
        return (char)ret;
    }
}