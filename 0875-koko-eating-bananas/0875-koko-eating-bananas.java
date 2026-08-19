class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i:piles){
            max=Math.max(i,max);
        }
        int min=1;
        int ans=max;
        while(min<=max){
            int mid = min+(max-min)/2;
            long speed=0;
            for(int i:piles){
                speed+=(i+mid-1)/mid;
            }
            if(speed<=h){
                ans=mid;
                max=mid-1;
            }
            else
            min=mid+1;
        }
        return ans;
    }
}