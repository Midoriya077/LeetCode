class Solution {
    public long maxSum(int[] nums, int k, int mul) {
    Arrays.sort(nums);
        long ans=0;
        int i = nums.length-1;
        while(k-->0){
            if(mul>1){
                ans+=(long)nums[i]*mul;
            }
            else{
                ans+=nums[i];
            }
            mul--;
            i--;
        }
        return ans;
    }
}