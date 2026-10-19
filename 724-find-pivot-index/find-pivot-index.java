class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int ans = -1;
        int[] pre = new int[n];
        pre[0] = nums[0];
        for(int i=1; i<n; i++){
            pre[i] = nums[i] + pre[i-1];
        }
        int[] suf = new int[n];
        suf[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            suf[i] = suf[i+1] + nums[i];
        }
        for(int i=0; i<pre.length && i < suf.length; i++){
            if(pre[i]==suf[i]){
                ans = i;
                break;
            }
        }
        return ans;
    }
}