class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num=i;
            int org=i;
            while(num>0){
                int digit=num%10;
                if(digit==0 || org%digit!=0){
                    break;
                }
                num/=10;
            }
            if(num==0){
                al.add(org);
            }
        }
        return al;
    }
}