class Solution {
    static long sumOfDivisors(int N) {
        long ans = 0;
        
        // Loop through each number i from 1 to N
        for (int i = 1; i <= N; i++) {
            // Add i to the sum of all its multiples up to N
            ans += i * (N / i);
        }
        
        return ans;
    }
}
