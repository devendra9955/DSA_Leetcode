class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int len = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.get(nums[j]) > k){
                int freq = map.get(nums[i]);
                map.put(nums[i],freq-1);
                i++;
            }
            len = Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}