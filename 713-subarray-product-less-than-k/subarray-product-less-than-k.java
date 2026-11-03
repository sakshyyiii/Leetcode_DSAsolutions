class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0,ans=0,prod=1;
        for(int h=0;h<nums.length;h++){
            prod*=nums[h];
            if(k <= 1) return 0;
            while(prod>=k){
                prod/=nums[l];
                l++;
            }
            ans+=h-l+1;
        }
        return ans;
    }
}