class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch>='a' && ch<='z' || ch>='0' && ch<='9'){
                sb.append(ch);
            }
        }
        String a = sb.toString();
        StringBuilder sd = new StringBuilder();
            for(int i=s.length()-1;i>=0;i--){
                char ch = Character.toLowerCase(s.charAt(i));
            if(ch>='a' && ch<='z' || ch>='0' && ch<='9'){
                sd.append(ch);
            }
        }
        String b = sd.toString();
        return a.equals(b);
    }
}