class Solution {
    public long countSubarrays(int[] nums, int k) {
        int l=0,c=0,maxc=Integer.MIN_VALUE;
        long ans=0;
        for(int i=0;i<nums.length;i++){
            maxc=Math.max(nums[i],maxc);
        }
        for(int h=0;h<nums.length;h++){
            if(nums[h]==maxc){
                c++;
            }
            while(c>=k){
                ans+=nums.length-h;
                if(nums[l]==maxc){
                    c--;
                }
                l++;
            }
        }
        return ans;
    }
}