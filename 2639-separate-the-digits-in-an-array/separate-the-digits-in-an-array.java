class Solution {
    public int[] separateDigits(int[] nums) {
        String ans="";
        int n = nums.length;
        for(int i=0; i<n; i++){
            ans += nums[i];
        }
        nums = new int[ans.length()];
        for(int i=0; i<ans.length(); i++){
            nums[i] = ans.charAt(i)-'0';
        }
        return nums;
    }
}