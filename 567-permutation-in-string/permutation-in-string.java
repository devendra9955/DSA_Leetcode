class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n>m) return false;
        int freqs1[] = new int[26];
        for(int i=0; i<n; i++){
            freqs1[s1.charAt(i)-'a']++;
        }
        int right;
        int freqs2[] = new int[26];
        for(right=0; right<n; right++){
            freqs2[s2.charAt(right)-'a']++;
            if(Arrays.equals(freqs1,freqs2)) return true;
        }
        int left=0;
        while(right<m){
            freqs2[s2.charAt(left)-'a']--;
            left++;
            freqs2[s2.charAt(right)-'a']++;
            right++;
            if(Arrays.equals(freqs1,freqs2)) return true;
        }
        return false;
    }
}