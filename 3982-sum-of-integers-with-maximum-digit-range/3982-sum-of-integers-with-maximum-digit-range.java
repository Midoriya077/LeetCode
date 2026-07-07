class Solution {
    public int maxDigitRange(int[] nums) {
        int range=-1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int org = nums[i];
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            while(org>0){
                int temp=org%10;
                max=Math.max(max,temp);
                min=Math.min(min,temp);
                org=org/10;
            }
            int currRange = max-min;
            if(currRange>range){
                range = currRange;
                sum=nums[i];
            }
            else if (currRange==range){
                sum+=nums[i];
            }
        }
        return sum;
    }
}