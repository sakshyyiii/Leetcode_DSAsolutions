class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,maxl=0,count0=0;
        for(int h=0;h<nums.length;h++){
            if(nums[h]==0){
                count0++;
            }
            while(count0>k){
                if(nums[l]==0){
                    count0--;
                }
                l++;
            }
            maxl=Math.max(h-l+1,maxl);
        }
        return maxl;
    }
}