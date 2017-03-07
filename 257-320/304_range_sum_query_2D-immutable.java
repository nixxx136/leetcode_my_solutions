public class NumMatrix {

    int[][] dp;

    public NumMatrix(int[][] matrix) {
        if (matrix==null || matrix.length<1 || matrix[0]==null || matrix[0].length<1) {
            dp = null;
            return;
        }
        
        dp = new int[matrix.length][matrix[0].length];
        dp[0][0] = matrix[0][0];
        // initial first row
        for (int col=1; col<matrix[0].length; col++) {
            dp[0][col] = dp[0][col-1]+matrix[0][col];
        }
        // initial first col
        for (int row=1; row<matrix.length; row++) {
            dp[row][0] = dp[row-1][0]+matrix[row][0];
        }
        // initial the rest of dp
        for (int row=1; row<matrix.length; row++) {
            for (int col=1; col<matrix[0].length; col++) {
                dp[row][col] = dp[row-1][col]+dp[row][col-1]-dp[row-1][col-1]+matrix[row][col];
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (row1==0 && col1!=0) return dp[row2][col2]-dp[row2][col1-1];
        else if (row1!=0 && col1==0) return dp[row2][col2]-dp[row1-1][col2];
        else if (row1==0 && col1==0) return dp[row2][col2];
        else return dp[row2][col2]-dp[row2][col1-1]-dp[row1-1][col2]+dp[row1-1][col1-1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */