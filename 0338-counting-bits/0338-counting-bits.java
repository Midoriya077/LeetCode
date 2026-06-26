class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++){
            int bit=0;
            int num=i;
            while(num>0){
                bit=bit+num%2;
                num=num/2;
            }
            arr[i]=bit;
        }
        return arr;
    }
}