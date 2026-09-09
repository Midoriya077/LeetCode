class Solution {
    public long countCommas(long n) {
        long sum = 0;
        long power = 1000;

        for(int i = 1; i <= 5; i++) {
            sum += Math.max(0L, (long)n - power + 1);
            power *= 1000;
        }

        return sum;
    }
}