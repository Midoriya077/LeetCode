class Solution {
    public int[] countBits(int n) {
        int[] al = new int[n+1];
        for(int i=0;i<=n;i++){
            int x=i;
            int count=0;
            while(x>0){
                int dig=x%2;
                if(dig==1)count++;
                x/=2;
            }
            al[i]=count;
        }
        return al;
    }
}