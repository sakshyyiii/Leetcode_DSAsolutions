class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        int maxl=0,l=0;
        for(int h=0;h<nums.length;h++){
            m.put(nums[h],m.getOrDefault(nums[h],0)+1);
            while(m.get(nums[h])>k){
                m.put(nums[l],m.get(nums[l])-1);
                if(m.get(nums[l])==0){
                    m.remove(nums[l]);
                }
                l++;
            }
            maxl=Math.max(maxl,h-l+1);
        }
        return maxl;
    }
}