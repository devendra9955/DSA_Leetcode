class Solution {
    public int binarySearch(int[] nums,int low ,int high, int target) {
        int ans = 0;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] > target) high=mid-1;
            else if(nums[mid] <= target) low = mid+1;
        } 
        return low;
    }
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int high = n-1;
        int negative = binarySearch(nums,0,high,-1);
        int positive = binarySearch(nums,negative,high,0);
        int positiveNum = n-positive;
        return Math.max(negative,positiveNum);
    }
}