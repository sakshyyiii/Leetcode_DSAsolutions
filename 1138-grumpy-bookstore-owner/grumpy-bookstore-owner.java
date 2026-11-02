class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                sum+=customers[i];
            }
        }
        int l=0,h=minutes-1,maxs=0;
        for(int i=l;i<=h;i++){
            if(grumpy[i]==1){
                sum+=customers[i];
            }
        }
        maxs=Math.max(maxs,sum);
        while(h<grumpy.length){
            if(grumpy[l]==1){
                sum-=customers[l];
            }
            l++;
            h++;
            if(h==customers.length){
                break;
            }
            if(grumpy[h]==1){
                sum+=customers[h];
                maxs=Math.max(maxs,sum);
            }
        }
        return maxs;
    }
}