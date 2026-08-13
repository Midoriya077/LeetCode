class Solution {
    public boolean isHappy(int n) {
        int count=0;
        while(n!=1 && count<100){
            int sum=0;
            while(n>0){
            int dig = n%10;
            sum+=Math.pow(dig,2);
            n/=10;
            }
            n=sum;
            count++;
        }
        return n==1;
    }
}