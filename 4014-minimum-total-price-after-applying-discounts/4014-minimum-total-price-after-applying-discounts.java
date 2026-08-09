class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double sum=0;
        int j=discounts.length-1;
        for(int i=prices.length-1;i>=0;i--){
            if(j>=0){
                sum+=prices[i]*(100.0-discounts[j])/100.0;
                j--;
            }
            else{
                sum+=prices[i];
            }
        }
        return sum;
    }
}