class Solution {
    public String reverseParentheses(String s) {
     Stack<StringBuilder> st = new Stack<>();
     StringBuilder ans = new StringBuilder();
     for(char ch:s.toCharArray()){
        if(ch=='('){
            st.push(ans);
            ans=new StringBuilder();
        }
        else if(ch==')'){
            ans.reverse();
            StringBuilder last = st.pop();
            last.append(ans);
            ans=last;
        }
        else{
            ans.append(ch);
        }
     }   
     return ans.toString();
    }
}