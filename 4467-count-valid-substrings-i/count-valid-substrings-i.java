class Solution {
    public long countValidSubstrings(String s) {
        int l=0;
        long ans=0;
        for(int h=0;h<s.length();h++){
            if(h >= 2 && s.charAt(h - 2)=='a' && s.charAt(h - 1)=='b' && s.charAt(h)=='c') {
                l = Math.max(l, h - 1);
            }
            ans+=h-l+1;
        }
        return ans;
    }
}