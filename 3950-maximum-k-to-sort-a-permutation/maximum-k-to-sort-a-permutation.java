class Solution {
    public int sortPermutation(int[] arr) {
        int n = arr.length;
        int first = -1;
        for(int i=0; i<n; i++){
            if(arr[i]!=i) {
                first = first & arr[i];
            }
        }
        
        return first==-1 ? 0:first;

    }
}