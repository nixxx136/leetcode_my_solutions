public class Solution {
    public int ladderLength(String begin, String end, List<String> wordList) {
        // breadth first search problem
        
        // change wordList to set first, so it will be faster to check
        // if a transformed word is in dict or not
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(end)) return 0;
        
        // visited to keep track of visited node(string)
        // to avoid loop
        Set<String> visited = new HashSet<>();
        visited.add(begin);
        
        // this is used to do the breath first search
        Queue<String> qu = new LinkedList<>();
        qu.offer(begin);
        qu.offer(null); // add null variable to separate each level, so we can count level
        
        int level = 1; // level variable to store which level we are at
        while (!qu.isEmpty()) { // do BFS
            String cur = qu.poll();
            
            if (cur!=null) {
                for (int i=0; i<cur.length(); i++) {
                    char[] chs = cur.toCharArray();
                    
                    for (char j='a'; j<='z'; j++) { // change ch i from a to z
                        chs[i] = j;
                        String s = new String(chs);
                        
                        if (s.equals(end)) return level+1; // if find end, then return level + 1
                        
                        if (dict.contains(s) && !visited.contains(s)) { // if s in dict and has not been visited yet
                            qu.offer(s); // add s to queue
                            visited.add(s); // add s to visited
                        }
                    }
                }
            } else {
                // if cur is null, which means we finished with this level
                level++; // then we update level
                if (!qu.isEmpty()) qu.offer(null); // if queue is not empty which means we are not done yet
            }
        }
        return 0;
    }
}