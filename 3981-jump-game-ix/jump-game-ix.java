
class Solution {

    public int[] maxValue(int[] nums) {

        int n = nums.length;
       //prefix max
        int[] prefixMax = new int[n];
        int[] ans = new int[n];

        prefixMax[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
        }
       //suffix min
        int[] sufmin = new int[n];

        sufmin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            sufmin[i] = Math.min(sufmin[i + 1], nums[i]);
        }

        ans[n - 1] = prefixMax[n - 1];
       //find the value 
        for (int i = n - 2; i >= 0; i--) {

            if (prefixMax[i] > sufmin[i + 1]) {
                ans[i] = ans[i + 1];
            } else {
                ans[i] = prefixMax[i];
            }
        }

        return ans;
    }
}