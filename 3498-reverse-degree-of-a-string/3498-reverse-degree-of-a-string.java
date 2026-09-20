class Solution {
    public int reverseDegree(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        int x=26;
        for(char ch = 'a';ch<='z';ch++){
            mp.put(ch,x);
            x--;
        }
        int sum=0;
        int j=1;
        for(int i=0;i<s.length();i++){
            sum+=j*mp.get(s.charAt(i));
            j++;
        }
        return sum;
        }
}