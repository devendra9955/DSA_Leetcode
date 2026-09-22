class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int freq[] = new int[26];
        int n = s.length();
        int m = p.length();
        int right;
        ArrayList<Integer> ans = new ArrayList<>();
        if(m>n) return ans;
        for(int i=0; i<m; i++){
            freq[p.charAt(i)-'a']++;
        }
        int j = 0;
        int freq1[] = new int[26];
        for(right=0; right<m; right++){
            freq1[s.charAt(right)-'a']++;
            if(Arrays.equals(freq,freq1)) ans.add(j);
        }
       
        while(right<n){
            freq1[s.charAt(j)-'a']--;
            j++;
            freq1[s.charAt(right)-'a']++;
            right++;
            if(Arrays.equals(freq,freq1)) ans.add(j);
        }
        return ans;

    }
}