class Solution {
    public int[] sieve(int n){
        int[] arr = new int[n+1];
        Arrays.fill(arr,1);
        arr[0] = 0;
        arr[1] = 0;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(arr[i]==1){
                for(int j=i*i; j<=n; j+=i){
                    arr[j]=0;
                }
            }
        }
        return arr;

    }
    public int[] closestPrimes(int left, int right) {
        int min = Integer.MAX_VALUE;
        int s[] = sieve(right);
        int ans[] = {-1,-1};
        int prev = -1;
        for(int i=left; i<=right; i++){
            if(s[i]==1){
                if(prev!=-1){
                    if(i-prev<min){
                        min = i-prev;
                        ans[0] = prev;
                        ans[1]=i;
                    }
                }
                prev = i;
            }
        }
        return ans;
    }
}