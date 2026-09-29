class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        ArrayList<Integer> al= new ArrayList<>();
        for(int x:map.keySet()){
            if(map.get(x)==2) al.add(x);
        }
        return al;
    }
}