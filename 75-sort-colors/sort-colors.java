class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int countzero = 0;
        int countones = 0;
        int counttwo = 0;
        int i = 0;
        for(int j=0; j<n; j++){
            if(nums[j]==0)countzero++;
            if(nums[j]==1) countones++;
            if(nums[j]==2) counttwo++; 
        }
        while(countzero>0){
            nums[i] = 0;
            i++;
            countzero--;
        }
        while(countones>0){
            nums[i] = 1;
            i++;
            countones--;
        }
        while(counttwo>0){
            nums[i] = 2;
            i++;
            counttwo--;
        }
    }
}