class Solution {
    public int climbStairs(int n) {

        // agar sirf 1 stair hai toh sirf ek hi way hai
        if (n == 1) {
            return 1;
        }

        // dp[i] store karega i-th stair tak pahunchne ke total ways
        int[] dp = new int[n + 1];

        // base cases
        dp[1] = 1;
        dp[2] = 2;

        // har stair ke liye previous 2 stairs ke ways add karenge
        for (int i = 3; i <= n; i++) {

            // current stair tak pahunchne ke total ways
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // last stair ka answer return karenge
        return dp[n];
    }
}