class Solution {
    public boolean helper(int[] nums, int target, int n,Boolean dp[][]){
        if(target == 0) return true;
        if(n==0) return false;
        if(dp[n][target] != null) return dp[n][target];
        if(target >= nums[n-1]) return dp[n][target]=helper(nums,target-nums[n-1],n-1,dp) || helper(nums,target,n-1,dp);
        return dp[n][target]=helper(nums,target,n-1,dp);
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
     
        for(int i=0; i<n; i++){
            sum = sum + nums[i];
        }
        if(sum % 2 !=0) return false;
         Boolean[][] dp = new Boolean[n+1][sum/2+1];
        return helper(nums,sum/2,n,dp);
      
    }
}