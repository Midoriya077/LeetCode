class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int[] pg = new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            int x = nums[i];
            max=Math.max(max,nums[i]);
            int y=max;
            while(y!=0){
                int temp=x%y;
                x=y;
                y=temp;
            }
            pg[i]=x;
        }
        Arrays.sort(pg);
        int left=0;
        int right=n-1;
        long sum=0;
        while(left<right){
            int x=pg[left];
            int y=pg[right];
            while(y!=0){
                int temp=x%y;
                x=y;
                y=temp;
            }
            sum+=x;
            left++;
            right--;
        }
        return sum;
    }
}