class Solution {
    public int lcs(int i, int j, StringBuilder s1, StringBuilder s2,int dp[][]){
        if(i<0 || j<0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)) return dp[i][j]= 1+lcs(i-1,j-1,s1,s2,dp);
        else return dp[i][j]=Math.max(lcs(i,j-1,s1,s2,dp),lcs(i-1,j,s1,s2,dp));
    }
    public int minInsertions(String s) {
        StringBuilder s2 = new StringBuilder(s);
        s2.reverse();
        int m = s.length();
        int n = s2.length();
        int dp[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                dp[i][j] = -1;
            }
        }
        int lps = lcs(m-1,n-1,new StringBuilder(s),s2,dp);
        return s.length()-lps;

    }
}