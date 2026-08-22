class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int i=0;
        int j;
        int count=0;
        int max = Integer.MIN_VALUE;
        for(j=0; j<k; j++){
            char ch = s.charAt(j);
            if(ch=='a' || ch=='e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
                
            }
            max = Math.max(max,count);
        }
        while(j < n){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count--;  
            }
            i++;
            char c = s.charAt(j);
            if(c=='a' || c=='e' || c == 'i' || c == 'o' || c == 'u'){
                count++;  
            }
            j++;
            max = Math.max(max,count);
            
        }

        return max;
    }
}