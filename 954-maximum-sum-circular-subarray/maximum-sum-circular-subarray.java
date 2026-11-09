class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int ans = nums[0];
        int min=nums[0];
        int tsum=0;
        for(int i=0;i<nums.length;i++){
            tsum+=nums[i];
        }
        for(int i=1;i<nums.length;i++){
            int v=nums[i];
            int v2=min+nums[i];
            min=Math.min(v,v2);
            ans=Math.min(ans,min);
        }
        int max=nums[0];
        int a2=nums[0];
        for(int i=1;i<nums.length;i++){
            int k=nums[i];
            int k2=max+nums[i];
            max=Math.max(k,k2);
            a2=Math.max(a2,max);
        }
        if (a2<0) {
            return a2;
        }
        return Math.max(a2,tsum-ans);
    }
}