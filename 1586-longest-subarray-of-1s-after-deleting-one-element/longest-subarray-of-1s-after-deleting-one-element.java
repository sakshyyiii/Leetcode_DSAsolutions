class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,maxl=0;
        int count0=0;
        for(int h=0;h<nums.length;h++){
            if(nums[h]==0){
                count0++;
            }
            while(count0>1){
                if(nums[l]==0){
                    count0--;
                }
                l++;
            }
            if(count0==1){
                maxl=Math.max(maxl,h-l);
            }else{
                maxl=Math.max(maxl,h-l);
            }
        }
        return maxl;
    }
}