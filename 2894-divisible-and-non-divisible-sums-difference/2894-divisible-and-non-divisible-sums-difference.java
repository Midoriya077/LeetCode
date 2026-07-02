class Solution {
    public int differenceOfSums(int n, int m) {
        int div=0;
        int ndiv=0;
        for(int i=1;i<=n;i++){
            int temp = i;
            if(temp%m==0){
                div+=temp;
            }
            else{
                ndiv+=temp;
            }
        }
        return (ndiv-div);
    }
}