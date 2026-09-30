class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int x:candyType){
            set.add(x);
        }
        int h = candyType.length/2;
        if(set.size()==h){
            return h;
        }
        else if(set.size()>h){
            return h;
        }
        else{
            return set.size();
        }
    }
}