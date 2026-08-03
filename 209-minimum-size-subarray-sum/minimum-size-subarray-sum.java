class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j=0;
        int sum = 0;
        int max = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            while(sum >= target){
                max = Math.min(max, i-j+1);
                sum = sum - nums[j];
                j++;
            }
        }
        return (max == Integer.MAX_VALUE) ? 0 : max;
    }
}