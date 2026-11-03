class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,maxl=0,c=0,maxfreq=0;
        Map<Character,Integer> m = new HashMap<>();
        for(int h=0;h<s.length();h++){
            m.put(s.charAt(h),m.getOrDefault(s.charAt(h),0)+1);
            maxfreq=Math.max(maxfreq,m.get(s.charAt(h)));
            while(h-l+1 - maxfreq > k){
                m.put(s.charAt(l),m.get(s.charAt(l))-1);
                if(m.get(s.charAt(l))==0){
                    m.remove(s.charAt(l));
                }                
                l++;
            }
            maxl=Math.max(maxl,h-l+1);
        }
        return maxl;
    }
}