class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int k = 0;
        int j = 1;
        int count=0;
        StringBuilder sb = new StringBuilder(s);
        while(n>j){
            if(sb.charAt(k) > sb.charAt(j)){
                count++;
            }
            k++;
            j++;
        }
        if(count == 0) return 0;
        if(n==2) return -1;

        char min = s.charAt(0);
        char max = s.charAt(0);
        for(int i=1; i<n; i++){
            if(s.charAt(i) > max) max = s.charAt(i);
            if(s.charAt(i) < min) min = s.charAt(i);
        }
        if(sb.charAt(0)==min || sb.charAt(n-1)==max) return 1;
        for(int i=1; i<n-1; i++){
            if(sb.charAt(i)==min || sb.charAt(i)==max) return 2;
        }
        return 3; 
    }
}