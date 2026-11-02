class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int l=0,h=s1.length()-1;
        Map<Character,Integer> m2 = new HashMap<>();
        Map<Character,Integer> m1 = new HashMap<>();
        for(int i=l;i<s1.length();i++){
            char ch=s1.charAt(i);
            m1.put(ch,m1.getOrDefault(ch,0)+1);
        }
        for(int i=l;i<=h;i++){
            char ch=s2.charAt(i);
            m2.put(ch,m2.getOrDefault(ch,0)+1);
        }
        if(m1.equals(m2)){
            return true;
        }
        while(h<s2.length()){
            char i=s2.charAt(l);
            m2.put(i,m2.get(i)-1);
            if(m2.get(i)==0){
                m2.remove(i);
            }
            l++;
            h++;
            if(h==s2.length()){
                break;
            }
            char r = s2.charAt(h);
            m2.put(r,m2.getOrDefault(r,0)+1);
            if(m1.equals(m2)){
            return true;
            }
        }
        return false;
    }
}