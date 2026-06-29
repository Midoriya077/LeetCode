class Solution {
    public int mostWordsFound(String[] sentences) {
        int n=sentences.length;
        int max=0;
        for(int i=0;i<n;i++){
            String[] ch = sentences[i].split(" ");
            int count=0;
            for(int j=0;j<ch.length;j++){
                count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }   
}