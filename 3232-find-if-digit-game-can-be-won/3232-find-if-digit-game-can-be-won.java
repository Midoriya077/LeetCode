class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9 && nums[i]>0){
                sum+=nums[i];
            }
            else{
                sum1+=nums[i];
            }
        }
        if(sum>sum1 || sum1 > sum){
            return true;
        }
        return false;
    }
}