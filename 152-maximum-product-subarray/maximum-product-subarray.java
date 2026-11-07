class Solution {
    public int maxProduct(int[] nums) {
        int ans=nums[0];
        int maxp=nums[0];
        int minp=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=minp*nums[i];
            int v3=maxp*nums[i];
            minp=Math.min(v1,Math.min(v2,v3));
            maxp=Math.max(v1,Math.max(v2,v3));
            ans=Math.max(ans,Math.max(minp,maxp));
        }
        return ans;
    }
}