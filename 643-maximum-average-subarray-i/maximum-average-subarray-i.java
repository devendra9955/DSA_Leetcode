class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double max = Integer.MIN_VALUE;
        double sum = 0;
        int i = 0;
        int j;
        for(j=0; j<k; j++){
            sum = sum + nums[j];
        }
        max = Math.max(max,sum/k);
        while(j<n){
            sum = sum + nums[j];
            sum = sum - nums[i];
            i++;
            j++;
            max = Math.max(max,sum/k);
        }
        return max;
    }
}