class Solution {
    public int maximumSum(int[] arr) {
        int onedel=Integer.MIN_VALUE;
        int nodel=arr[0];
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            int prevonedel=onedel;
            int prevnodel=nodel;
            nodel=Math.max(prevnodel+arr[i],arr[i]);
            int v=0;
            if(onedel==Integer.MIN_VALUE){
                v=arr[i];
            }else{
                v=prevonedel+arr[i];
            }
            onedel=Math.max(v,prevnodel);
            ans=Math.max(ans,Math.max(nodel,onedel));
        }
        return ans;
    }
}