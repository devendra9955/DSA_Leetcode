class Solution {
    int absSum ;
    public int helper(int i, int[] nums,int targetSum, int target,int dp[][]){
        if(i==nums.length){
            if(target == targetSum) return 1;
            else return 0;
        }
        if(dp[i][absSum+targetSum] != 0) return dp[i][absSum+targetSum];
        int add = helper(i+1, nums,targetSum+nums[i], target,dp);
        int subt = helper(i+1, nums,targetSum - nums[i], target,dp);
        return dp[i][absSum+targetSum]=add + subt;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        absSum = 0;
        for(int ele : nums) absSum +=Math.abs(ele);
        int dp[][] = new int[nums.length][2*absSum + 1];
        return helper(0,nums,0,target,dp);
    }
}