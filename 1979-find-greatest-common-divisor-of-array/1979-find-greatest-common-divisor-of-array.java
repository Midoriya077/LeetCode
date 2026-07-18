class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int ele:nums){
            min=Math.min(min,ele);
            max=Math.max(max,ele);
        }
        while(max!=0){
            int temp=min%max;
            min=max;
            max=temp;
        }
        return min;
    }
}