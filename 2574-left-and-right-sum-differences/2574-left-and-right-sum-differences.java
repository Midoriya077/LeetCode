class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftsum = new int[nums.length];
        leftsum[0]=0;
        int j=1;
        for(int i=0;i<nums.length-1;i++){
            leftsum[j]=nums[i]+leftsum[i];
            j++;
        }
        int[] rightsum = new int[nums.length];
        rightsum[nums.length-1]=0;
        int k=rightsum.length-2;
        for(int i=nums.length-2;i>=0;i--){
            rightsum[k]=nums[i+1]+rightsum[i+1];
            k--;
        }
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return arr;
    }
}