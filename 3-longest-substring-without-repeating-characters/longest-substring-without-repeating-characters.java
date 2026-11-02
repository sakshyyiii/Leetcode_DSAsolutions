class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,maxl=0;
        Set<Character> set = new HashSet<>();
        for(int h=0;h<s.length();h++){
            while(set.contains(s.charAt(h))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(h));
            maxl=Math.max(maxl,h-l+1);
        }
        return maxl;
    }
}