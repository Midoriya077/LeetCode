class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int[] malviretho=parent;
        int[] ans=new int[parent.length];
        long sum=0;

        ans[0]=1;

        for(int i=1;i<parent.length;i++){
            int node=i;
            int count=0;

            while(ans[node]==0){
                count++;
                node=parent[node];
            }

            int depth=ans[node];

            node=i;

            while(count>0){
                depth++;
                ans[node]=depth;
                node=parent[node];
                count--;
            }
        }

        int max=0;

        for(int i=0;i<ans.length;i++){
            max=Math.max(max,ans[i]);
        }

        for(int i=0;i<nums.length;i++){
            long result=(long)nums[i]*(max-ans[i]+1);
            sum+=result;
        }

        return sum;
    }
} 