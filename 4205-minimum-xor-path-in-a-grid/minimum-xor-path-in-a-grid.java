class Solution {
    int min;
    public int xorOperator(int m , int n,int grid[][],int xor,int dp[][][]){
        if(m <0 || n < 0) return Integer.MAX_VALUE;
        xor ^= grid[m][n];
        if(m==0 && n==0) return xor;
         if(dp[m][n][xor] != -1) return dp[m][n][xor];
        int left = xorOperator(m,n-1,grid,xor,dp);
        int up = xorOperator(m-1,n,grid,xor,dp);
        return dp[m][n][xor] = Math.min(left,up);

    }
    public int minCost(int[][] grid) {
       
        min = Integer.MAX_VALUE;
        int m = grid.length;
        int n = grid[0].length;
        int dp[][][] = new int[m][n][1024];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return xorOperator(m-1,n-1,grid,0,dp);
    }
}