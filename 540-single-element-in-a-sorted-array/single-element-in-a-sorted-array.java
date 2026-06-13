class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int lo = 0;
        int hi = n-1;
        int p = 0;
        int d = 0;
        int countleft = 0;
        int countright = 0;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(mid==0) return nums[0];
            if(mid == n-1) return nums[n-1];
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];
            else if(nums[mid] == nums[mid-1]){
                p = mid-1;
                d = mid;
                countleft = p-lo;
                countright = hi-d;
                if(countright % 2==1) lo = d+1;
                else hi = p-1;
            }
            else{
                p = mid+1;
                d = mid;
                countleft = d-lo;
                countright = hi-p;
                if(countright % 2==1) lo = p+1;
                else hi = d-1;
            }
        }
        return -1;
    }
}