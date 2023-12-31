class Solution {
    
    public:
    int isPossible(int N , int coins[]) 
    {
        vector<vector<int>> dp(N + 1, vector<int> (2025, 0));
        
        for(int i = 20; i < 2025; i += 20)
            dp[N][i] = 1;
        for(int i = 24; i < 2025; i += 24)
            dp[N][i] = 1;
        dp[N][2024] = 1;
        
        for(int i = N - 1; i > -1; i--){
            for(int j = 0; j < 2025; j++){
                int take, notake;
                take = notake = 0;
                
                notake = dp[i + 1][j];
                
                if(coins[i] + j < 2025)
                    take = dp[i + 1][j + coins[i]];
                    
                dp[i][j] = max(take, notake);
            }
        }
        
        return dp[0][0];
    }
    
};
