class Solution {
    public String mergeAlternately(String word1, String word2) {
        Stack<Character> st = new Stack<>();
       for(int i=0;i<word1.length()||i<word2.length();i++){
        if(i<word1.length())st.push(word1.charAt(i));
        if(i<word2.length())st.push(word2.charAt(i));
       }
       StringBuilder sb = new StringBuilder();
       while(!st.isEmpty()){
        sb.append(st.pop());
       }
       return sb.reverse().toString(); 
    }
}