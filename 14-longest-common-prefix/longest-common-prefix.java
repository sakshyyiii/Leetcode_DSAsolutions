class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        Arrays.sort(strs);
        char[] frst= strs[0].toCharArray();
        char[] lst= strs[strs.length-1].toCharArray();
        for(int i=0; i<frst.length; i++){
            if(frst[i]!=lst[i]){
                break;
            }else{
                result.append(frst[i]);
            }
        }
        return result.toString();
    }
}