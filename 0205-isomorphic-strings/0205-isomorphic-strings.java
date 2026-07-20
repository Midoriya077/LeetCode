class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] ch = s.toCharArray();
        char[] ct = t.toCharArray();
        HashMap<Character,Character> mp = new HashMap();
        for(int i=0;i<ch.length;i++){
            if(mp.containsKey(ch[i])){
                if(mp.get(ch[i])!=ct[i])return false;
            }
            else{
                if(mp.containsValue(ct[i]))return false;
                mp.put(ch[i],ct[i]);
            }
        }
        return true;
    }
}