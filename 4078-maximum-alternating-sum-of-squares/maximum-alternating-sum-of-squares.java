class Solution {
    public long maxAlternatingSum(int[] nums) {
       int n = nums.length;
       long firstHalf = 0;
       long secondHalf=0;
       for(int i=0; i<n; i++){
           nums[i] *= nums[i];
       }
       Arrays.sort(nums);
       for(int i=0; i<n; i++){
          if(i < n/2) firstHalf += nums[i];
          else secondHalf += nums[i];
       }
       return (secondHalf-firstHalf);
    }
}