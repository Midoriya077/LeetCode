class Solution {
    public boolean isPerfectSquare(int num) {
        for(int i=1;i<=num/i;i++){
            int div=num/i;
            if(div==i && num%i==0){
                return true;
            }
        }
        return false;
    }
}