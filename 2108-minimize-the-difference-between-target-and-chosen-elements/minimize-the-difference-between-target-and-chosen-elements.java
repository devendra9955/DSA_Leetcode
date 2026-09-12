class Solution {
    public int solve(int[][] mat , int sum , int target, int row,int dp[][]){
        if(row >= mat.length){
            return Math.abs(target-sum);
        }
        if(dp[row][sum] != -1) return dp[row][sum];
        int min = Integer.MAX_VALUE;
        for(int num : mat[row]){
            int ans = solve(mat,sum+num, target, row+1,dp);
            min = Math.min(min,ans);
        }
        return dp[row][sum]=min;
    }
    public int minimizeTheDifference(int[][] mat, int target) {
        int row = 0;
        int sum = 0;
        int dp[][] = new int[mat.length][5001];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<5001; j++){
                dp[i][j] = -1;
            }
        }
        int ans = solve(mat,sum , target,row,dp);
        return ans;
    }
}