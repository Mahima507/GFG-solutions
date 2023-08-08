class Solution 
{ 
    // Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        // Create a DP table to store maximum values for different capacities
        int[][] dp = new int[n + 1][W + 1];
        
        // Initialize the DP table for the base case (no items or no capacity)
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (wt[i - 1] <= w) {
                    // If the current item's weight is less than or equal to the capacity,
                    // we have two choices: include it or exclude it
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                } else {
                    // If the current item's weight is greater than the capacity,
                    // we can only exclude it
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        
        // The final answer is stored in the bottom-right corner of the DP table
        return dp[n][W];
    } 
}
