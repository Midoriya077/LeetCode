class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int x=n;
        while(x>0){
            int dig=x%10;
            sum+=dig;
            prod*=dig;
            x/=10;
        }
        if(n%(sum+prod)==0){
            return true;
        }
        return false;
    }
}