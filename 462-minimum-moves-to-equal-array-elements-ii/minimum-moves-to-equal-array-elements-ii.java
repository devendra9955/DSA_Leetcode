class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int secondMax = Integer.MIN_VALUE;
        Arrays.sort(nums);
        int median = nums[n/2];
        
        for(int i=0; i<n; i++){
            if(nums[i] > max) max = nums[i];
        }
        for(int i=0; i<n; i++){
            if(nums[i] > secondMax && nums[i] != max){
                secondMax = nums[i];
            }
        }
        for(int i=0; i<n; i++){
            sum = sum + Math.abs(median-nums[i]);
        }
        if(sum == Integer.MAX_VALUE) sum = 0;
        return sum;
    }
}