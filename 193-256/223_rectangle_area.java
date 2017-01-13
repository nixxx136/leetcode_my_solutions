public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        // area of two rects
        int total = (C-A)*(D-B)+(G-E)*(H-F);
        
        // one rect is on the left of the other rect
        if (C<=E||G<=A) return total;
        
        // one rect is on the top of the other rect
        if (D<=F||H<=B) return total;
        
        // last case: they are overlap, total minus the overlap
        int x_overlap = Math.min(C,G)-Math.max(A,E);
        int y_overlap = Math.min(D,H) - Math.max(B,F);
        return total - x_overlap * y_overlap;
    }
}