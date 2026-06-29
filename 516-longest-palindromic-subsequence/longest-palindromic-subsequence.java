class Solution {
    public int helper(int i, int j, StringBuilder s1, StringBuilder s2,int dp[][]){
        if(i < 0 || j < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)) return dp[i][j]=1+helper(i-1, j-1, s1, s2,dp);
        else return dp[i][j]= Math.max(helper(i,j-1,s1,s2,dp),helper(i-1,j,s1,s2,dp));
    }
    public int longestPalindromeSubseq(String s) {
        int m = s.length();
        String s2 = new StringBuilder(s).reverse().toString();
        int n = s2.length();
        int dp[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                dp[i][j] = -1;
            }
        }
        return helper(m-1,n-1,new StringBuilder(s),new StringBuilder(s2),dp);
    }
}