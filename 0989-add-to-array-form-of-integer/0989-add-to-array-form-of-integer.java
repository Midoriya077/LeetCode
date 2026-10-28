class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=num.length-1;i>=0;i--){
            k+=num[i];
            al.add(k%10);
            k/=10;
        }
        while(k>0){
            al.add(k%10);
            k/=10;
        }
        Collections.reverse(al);
        return al;
    }
}