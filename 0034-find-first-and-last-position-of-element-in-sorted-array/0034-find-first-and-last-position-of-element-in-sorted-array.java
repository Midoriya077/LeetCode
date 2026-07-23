class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=-1;
        int last=-1;
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                start = i;
                break;
            }
        }
        for(int i = nums.length-1;i>=0;i--){
            if(nums[i]==target){
                last=i;
                break;
            }
        }
       
       
        arr[0]=start;
        arr[1]=last;
        return arr;
        
    }
}