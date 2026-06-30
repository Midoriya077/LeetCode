class Solution {
    public boolean isGoodArray(int[] nums) {
        int x=nums[0];
        for(int z : nums){
            while(z>0){
                int y=x%z;
                x=z;
                z=y;
            }
        }
        return x==1;
    }
}