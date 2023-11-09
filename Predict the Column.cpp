class Solution{
    public:
    /*Function to count zeros in each column
    * N : Number of rows and columns in array
    M is the matrix that is globally declared
    */
    int columnWithMaxZeros(vector<vector<int>>arr,int N){
        int best = 0;
        int ans = -1;

        for(int j = 0; j < N; j++){
            int cur = 0;

            for(int i = 0; i < N; i++)
                cur += arr[i][j] == 0;

            if(cur > best){
                best = cur;
                ans = j;
            }
        }

        return ans;
    }
};
