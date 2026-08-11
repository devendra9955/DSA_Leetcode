class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        while(right<n){
            while(set.contains(nums[right])){
                sum = sum - nums[left];
                set.remove(nums[left]);
                left++;
                max = Math.max(max,sum);
            }
            set.add(nums[right]);
            sum = sum + nums[right];
            right++;
            max = Math.max(max,sum);
            
        }
        return max;
    }
}