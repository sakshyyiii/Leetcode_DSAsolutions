class Solution {
    public int removeDuplicates(int[] nums) {
       int i =2;
       for(int curr =2; curr<nums.length;curr++){
        if(nums[curr]!=nums[i-2]){
            nums[i]=nums[curr];
            i++;
        }
       }
       return i;
    }
}