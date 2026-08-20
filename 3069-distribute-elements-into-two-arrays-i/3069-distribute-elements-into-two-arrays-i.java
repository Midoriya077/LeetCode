class Solution {
    public int[] resultArray(int[] nums) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        st.push(nums[0]);
        st1.push(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(st.peek()>st1.peek()){
                st.push(nums[i]);
            }
            else{
                st1.push(nums[i]);
            }
        }
        int[] arr = new int[nums.length];
        Stack<Integer> st2 = new Stack<>();
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        while(!st2.isEmpty()){
            for(int i=0;i<arr.length;i++){
                arr[i]=st2.pop();
            }
        }
        return arr;
    }
}