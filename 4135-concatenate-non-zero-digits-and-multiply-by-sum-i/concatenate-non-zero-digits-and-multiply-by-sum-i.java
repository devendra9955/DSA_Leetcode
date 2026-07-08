class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        long sum = 0;
        long x=0;
        long product = 1;
        while(n>0){
            long rem = n%10;
            if(rem !=0){
                x = rem*product+x;
                sum = sum + rem;
                product = product *10;
            }
            n = n/10;
        }
        product = sum * x;
        return product;
    }
}