class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<n;i++){
            if(nums[i] > max) max = nums[i];
            sum = sum + nums[i];
        }
        return n*max - sum;
    }
}