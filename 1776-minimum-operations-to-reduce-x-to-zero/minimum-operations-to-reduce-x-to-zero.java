class Solution {
    public int minOperations(int[] nums, int x) {
        int maxl=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];            
        }
        int target=sum-x;
        if(target<0){
            return -1;
        }
        int win=0;
        int l=0;
        for(int h=0;h<nums.length;h++){
            win+=nums[h];
            while(win>target){
                win-=nums[l];
                l++;
            }
            if(win==target){
                maxl=Math.max(maxl,h-l+1);
            }
        }
        if(maxl == 0 && target != 0) return -1;
        return nums.length-maxl;
    }
}