class Solution {
    public int[] twoSum(int[] arr, int target) {
        int ans[] = new int[2];
        int n = arr.length;
        int i=0;
        int j=n-1;
        int idx1=-1;
        int idx2 = -1;
        while(j>i){
            if(arr[i]+arr[j] == target){
                idx1 = i+1;
                idx2 = j+1;
                break;
            }
            else if(arr[i]+arr[j] > target) j--;
            else if(arr[i]+arr[j] < target) i++;
        }
        ans[0] = idx1;
        ans[1] = idx2;
        return ans;
    }
}