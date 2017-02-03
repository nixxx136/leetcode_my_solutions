public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // basically, use two pointer to search and start from top right corner
        // I think we can also start from bottom left corner, but it will slow
        if (matrix==null || matrix.length<1 || matrix[0].length<1) return false;
        int row=0, col=matrix[0].length-1;
        while (row<matrix.length && col>=0) {
            if (matrix[row][col]>target) {
                col--;
            } else if (matrix[row][col]<target) {
                row++;
            } else {
                return true;
            }
        }
        return false;
    }
}