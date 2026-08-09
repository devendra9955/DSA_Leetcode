class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int i=0;
        int j;
        int count=0;
        int avg = 0;
        int sum = 0;
        for(j=0; j<k; j++){
            sum = sum + arr[j];
        }
        avg = sum/k;
        if(avg >=threshold) count++;
        while(j<n){
            sum = sum + arr[j];
            sum = sum - arr[i];
            i++;
            j++;
            avg = sum /k;
            if(avg>=threshold) count++;
        }
        return count;
    }
}