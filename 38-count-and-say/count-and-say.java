class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        if(n==2) return "11";
        String s = countAndSay(n-1);
        String ans = "";
        int i=0;
        int j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else if(s.charAt(i) != s.charAt(j)){
                int freq = j-i;
                ans = ans+freq;
                ans = ans + s.charAt(i);
                i=j;
            }
        }
        int freq = j-i;
        ans += freq;
        ans += s.charAt(i);

        return ans;
    } 
}