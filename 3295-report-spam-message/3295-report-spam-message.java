class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        int count=0;
        HashSet<String> set = new HashSet<>();
        for(String x:bannedWords){
            set.add(x);
        }
        for(String x:message){
            if(set.contains(x)){
                count++;
            }
        }
        if(count>=2)return true;
        return false;
    }
}