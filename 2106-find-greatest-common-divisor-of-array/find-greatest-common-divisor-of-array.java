class Solution {
    public int findGCD(int[] nums) {
        int ans = 1;
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(max < nums[i]){
                max = nums[i];
            }

            if(min > nums[i]){
                min = nums[i];
            }
        }
        for(int i=2; i<=min; i++){
            if(max % i == 0 && min %i==0) ans=i;
        }
        return ans;
    }
}