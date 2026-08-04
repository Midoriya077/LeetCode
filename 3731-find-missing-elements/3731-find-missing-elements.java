class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        HashSet<Integer> set1 = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set1.add(nums[i]);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=min;i<=max;i++){
            set.add(i);
        }
        for(int ele : set){
            if(!set1.contains(ele)){
                al.add(ele);
            }
        }
        Collections.sort(al);
        return al;
    }
}