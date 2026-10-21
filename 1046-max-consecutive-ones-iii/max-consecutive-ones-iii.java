class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int zeroes = 0;
        int maxLen = 0;
        while(j<n){
            if(nums[j]==0) zeroes++;
            while(zeroes > k){
                if(nums[i]==0){
                    zeroes--;
                }
                i++;
            }
            maxLen = Math.max(maxLen , j-i+1);
            j++;
        }
        return maxLen;
    }
}