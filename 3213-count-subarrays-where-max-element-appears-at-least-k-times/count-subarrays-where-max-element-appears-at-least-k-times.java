class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int maxEle = nums[0];
        int start = 0;
        int end = 0;
        int count = 0;
        long total = 0;
        for(int i=0; i<n; i++){
            maxEle = Math.max(maxEle,nums[i]);
        }
        while(end<n){
            if(nums[end] == maxEle) count++;
            while(count>=k){
                total = total + (n-end);
                if(nums[start]==maxEle){
                    count--;
                }
                start++;
            }
            end++;
        }
        return total;

    }
}