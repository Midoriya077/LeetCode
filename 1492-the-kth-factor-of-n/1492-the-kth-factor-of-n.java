class Solution {
    public int kthFactor(int n, int k) {
        Stack<Integer> st = new Stack<>();
        for(int i=1;i<=n;i++){
            int x=n;
            if(x%i==0){
            st.push(i);
            }
        }
        int[] arr = new int[st.size()];
        int i=0;
        while(!st.isEmpty()){
            int var = st.pop();
            arr[i]=var;
            i++;
        }
        if(k>arr.length)return -1;
        return arr[arr.length-k];
    }
}