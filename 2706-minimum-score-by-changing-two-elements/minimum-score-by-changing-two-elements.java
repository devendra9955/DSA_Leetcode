class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<3; i++){
            int min = nums[i];
            int max = nums[n - 3 + i];
            ans = Math.min(ans,max-min);
        }
        return ans;
    }
}