class Solution {
    public int lengthOfLastWord(String s) {
        String[] ch =s.trim().split("\\s+");
        return ch[ch.length-1].length();
       }
}