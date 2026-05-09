class Solution {
    public void sortColors(int[] nums) {
        // int lo = 0;
        // int mid = 0;
        // int hi = nums.length-1;
        // while(mid <= hi){
        //     if(nums[mid]==0){
        //         int temp = nums[lo];
        //         nums[lo] = nums[mid];
        //         nums[mid] = temp;
        //         lo++;
        //         mid++;
        //     }
        //     else if(nums[mid]==2){
        //         int temp = nums[hi];
        //         nums[hi] = nums[mid];
        //         nums[mid] = temp;
        //         hi--;
        //     }
        //     else mid++;
        // }
        int z = 0;
        int o = 0;
        int t = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                z++;
            }
            else if(nums[i]==1){
                o++;
            }
            else if(nums[i]==2){
                t++;
            }
        }
        int i=0;
        while(z-- > 0){
            nums[i]=0;
            i++;
        }
        while(o-- > 0){
            nums[i]=1;
            i++;
        }
        while(t-- >0){
            nums[i]=2;
            i++;
        }
    }
}