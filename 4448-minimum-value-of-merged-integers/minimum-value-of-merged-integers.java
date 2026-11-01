class Solution {
    public int minMergedInteger(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = i+1;
        while(j<n){
            StringBuilder str = new StringBuilder();
            int num1 = nums[i];
            int num2 = nums[j];
            str.append(num1);
            str.append(num2);
            min = Math.min(min,Integer.parseInt(str.toString()));
            i=i+2;
            j=j+2;
        }
        return min;
    }
}