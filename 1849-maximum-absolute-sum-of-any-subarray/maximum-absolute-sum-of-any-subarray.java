class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int mins=nums[0];
        int maxs=nums[0];
        int sum = nums[0];
        int sum2=nums[0];
        int ans= Math.abs(nums[0]);
        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=sum+nums[i];
            int v3=sum2+nums[i];
            sum=Math.max(v1,v2);
            sum2=Math.min(v1,v3);
            mins=Math.min(mins,sum2);
            maxs=Math.max(maxs,sum);
            ans=Math.max(Math.abs(mins),Math.abs(maxs));
        }
        return ans;
    }
}