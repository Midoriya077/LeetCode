class Solution {
    public int maxProduct(int n) {
        int x=n;
        int count=0;
        while(x>0){
            count++;
            x/=10;
        }
        int[] arr = new int[count];
        int i=0;
        while(n>0){
            int dig=n%10;
            arr[i]=dig;
            i++;
            n/=10;
        }
        Arrays.sort(arr);
        return arr[arr.length-1]*arr[arr.length-2];
    }
}