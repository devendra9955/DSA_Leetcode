class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int sum = 0;
        for(int ele : nums){
            sum = sum + ele;
        }
        int target = sum - x;
        int min = Integer.MIN_VALUE;
        int i= 0;
        int j = 0;
        int targetsum = 0;
        while(j < n){
            targetsum = targetsum + nums[j];
            while(targetsum > target && i <= j){
                targetsum = targetsum - nums[i];
                i++;
            }
            if(targetsum == target){
                min = Math.max(min,j-i+1);
            }
            j++;
        }
        if(min == Integer.MIN_VALUE){
            return -1;
        }
        return n - min;
    }
}