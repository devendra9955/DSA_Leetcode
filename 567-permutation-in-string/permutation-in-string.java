class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int freq[] = new int[26];
        if(n>m) return false;
        for(int i=0; i<n; i++){
            freq[s1.charAt(i)-'a']++;
        }
        int freqsecond[] = new int[26];
        for(int j=0; j<n; j++){
            freqsecond[s2.charAt(j)-'a']++;
        }
        if (Arrays.equals(freq, freqsecond)) {
                return true;
            }
        int k = 0;
        int j = n;
        while(j<m){
            
            freqsecond[s2.charAt(j)-'a']++;
            freqsecond[s2.charAt(k)-'a']--;
            k++;
            j++;
            if (Arrays.equals(freq, freqsecond)) {
                return true;
            }
        }
        return false;
    }
}