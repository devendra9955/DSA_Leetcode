class Solution {
    public int jumps(int[] nums, int target, int i, int dp[]) {
        int n = nums.length;

        if (i == n - 1) return 0;

        if (dp[i] != -1) return dp[i];

        int result = Integer.MIN_VALUE;

        for (int j = i + 1; j < n; j++) {
            if (Math.abs(nums[i] - nums[j]) <= target) {
                int temp = jumps(nums, target, j, dp);

                if (temp != Integer.MIN_VALUE) {
                    result = Math.max(result, 1 + temp);
                }
            }
        }

        dp[i] = result;
        return dp[i];
    }

    public int maximumJumps(int[] nums, int target) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp, -1);

        int ans = jumps(nums, target, 0, dp);

        if (ans == Integer.MIN_VALUE) {
            return -1;
        } else {
            return ans;
        }
    }
}