class Solution {
    public boolean isMiddleElementUnique(int[] nums) {

        int mid = (int)Math.ceil(nums.length/2);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[mid]){
                count++;
            }
        }
        if(count==1)return true;
        return false;
    }
}