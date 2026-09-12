class Solution {
    public boolean canJump(int nums[],int idx,Boolean[] dp){
        if(idx == nums.length-1) return true;
        if(idx >= nums.length) return false;
        if(nums[idx]==0) return false;
        if(dp[idx] != null) return dp[idx];
        int numOfJump = nums[idx];
        boolean isjump = false;
        for(int jump=1; jump<=numOfJump; jump++){
            boolean ans = canJump(nums,idx+jump,dp);
            isjump = isjump || ans;
            if(isjump) break;
        }
        return dp[idx]=isjump;
    }
    public boolean canJump(int[] nums) { 
       int n = nums.length;
       Boolean dp[] = new Boolean[n];
       boolean solve = canJump(nums,0,dp);
       return solve;
    }
}