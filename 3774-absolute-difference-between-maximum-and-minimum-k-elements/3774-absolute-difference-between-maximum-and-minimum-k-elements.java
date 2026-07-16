class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int ls = 0;
        int ss = 0;
        for(int i=0;i<nums.length && k>0;i++){
            ls+=nums[n-i];
            ss+=nums[i];
            k--;
        }
        return Math.abs(ls-ss);
    }
}