class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==0 && j==0) dp[i][j] = grid[i][j];
                else if(i==0) dp[i][j] = grid[i][j] + dp[i][j-1];
                else if(j==0) dp[i][j] = grid[i][j] + dp[i-1][j];
                else dp[i][j] = grid[i][j] + Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m-1][n-1];
    }
}

// class Solution {

//     public int helper(int i, int j, int[][] grid) {

//         // Base case
//         if (i == 0 && j == 0)
//             return grid[0][0];

//         // Out of bounds
//         if (i < 0 || j < 0)
//             return Integer.MAX_VALUE;

//         int up = helper(i - 1, j, grid);
//         int left = helper(i, j - 1, grid);

//         int ans = Math.min(up, left);

//         // Avoid overflow
//         if (ans == Integer.MAX_VALUE)
//             return ans;

//         return grid[i][j] + ans;
//     }

//     public int minPathSum(int[][] grid) {
//         int m = grid.length;
//         int n = grid[0].length;

//         return helper(m - 1, n - 1, grid);
//     }
// }