public class Solution {
    // union find method to solve this problem
    public int findCircleNum(int[][] M) {
        int n = M.length;
        int[] mem = new int[n];
        for (int i=0; i<n; i++) { mem[i] = i;}
        
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (M[i][j]==1) {
                    union(mem, i, j);
                }
            }
        }
        
        int count=0;
        for (int i=0; i<n; i++) { 
            if(mem[i] == i) {
                count++;   
            }
        }
        return count;
    }
    
    public void union(int[] mem, int i, int j) {
        int root_i = find(mem, i);
        int root_j = find(mem, j);
        mem[root_j] = root_i;
    }
    
    
    public int find(int[] mem, int i) {
        if (mem[i] == i) return i;
        else return find(mem, mem[i]);
    }
}