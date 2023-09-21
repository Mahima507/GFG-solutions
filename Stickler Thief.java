class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
    int[] dp = new int[n];
    dp[0] = arr[0];
    dp[1] = Math.max(arr[0], arr[1]);
    for (int i = 2; i < n; i++) {
        dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
    }
    return dp[n - 1];

    }
}
