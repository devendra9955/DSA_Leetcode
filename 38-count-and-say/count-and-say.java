class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
       if(n==2) return "11";
        String ans = "";
        String s = countAndSay(n-1); 
        int i=0;
        int j = 0;
        while(j<s.length()){
            if(s.charAt(i) == s.charAt(j)) j++;
            else if(s.charAt(i) != s.charAt(j)){
                int freq = j-i;
                ans = ans+freq;
                ans = ans + s.charAt(i);
                i=j;
            }
           
        }
        int freq = j-i;
        ans = ans + freq;
        ans = ans + s.charAt(i);
        return ans;
    }
}