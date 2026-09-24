class Solution {
    public int smallestIndex(int[] arr) {
        int n = arr.length;
        int index = -1;
        for(int i=0; i<n; i++){
            int sum = 0;
            while(arr[i] > 0){
                int rem = arr[i] % 10;
                sum = sum +rem;
                arr[i] = arr[i] / 10;
            }
            if(sum == i){
                index = i;
                break;
            }
        }
        return index;
    }
}