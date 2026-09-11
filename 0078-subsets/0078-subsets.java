class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> al1 = new ArrayList<>();

        solve(nums, 0, al1, al);

        return al;
    }

    void solve(int[] nums, int i, List<Integer> al1, List<List<Integer>> al) {

        if(i == nums.length) {
            al.add(new ArrayList<>(al1));
            return;
        }

        // take
        al1.add(nums[i]);
        solve(nums, i + 1, al1, al);

        // don't take
        al1.remove(al1.size() - 1);
        solve(nums, i + 1, al1, al);
    }
}