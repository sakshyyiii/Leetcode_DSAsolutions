class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        int h=k-1;
        double sum=0;
        double ans= Integer.MIN_VALUE;
        for(int i=l;i<=h;i++){
            sum+=nums[i];
        }
        double avg = (double)sum/k;
        while(h<nums.length){
            ans=Math.max(ans,avg);
            sum-=nums[l];
            l++;
            h++;
            if(h==nums.length){
                break;
            }
            sum+=nums[h];
            avg=(double)sum/k;
        }
        return ans;
    }
}