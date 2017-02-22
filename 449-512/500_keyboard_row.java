public class Solution {
    public String[] findWords(String[] words) {
        if (words==null || words.length<1) return words;
        
        List<String> ls = new LinkedList<>();
        
        for (String s : words) {
            if (check(s.toLowerCase())) ls.add(s);
        }
        
        String[] res = new String[ls.size()];
        for (int i=0; i<ls.size(); i++) {
            res[i] = ls.get(i);
        }
        return res;
    }
    
    public boolean check(String s) {
        String s1 = "qwertyuiop", s2="asdfghjkl", s3="zxcvbnm", test;
        char[] sc = s.toCharArray();
        if (s1.indexOf(sc[0])!=-1) {test=s1;}
        else if (s2.indexOf(sc[0])!=-1) {test=s2;}
        else {test=s3;}
        
        for (char ch : sc) {
            if (test.indexOf(ch)==-1) return false;
        }
        return true;
    }
}