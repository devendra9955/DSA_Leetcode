class Solution {
    public boolean isAnagram(String s, String t) {
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for(int i=0; i<s.length(); i++){
            freq1[s.charAt(i)-'a']++;
        }
        for(int j=0; j<t.length(); j++){
            freq2[t.charAt(j)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)) return true;
        return false;
    }
}