//POTD 16TH AUG
class Solution
{
    public:
    //Function to find the nth catalan number.
    int findCatalan(int n) 
    {
        //code here
        vector<long long int>ans(n+1);
        ans[0]=1;
        ans[1]=1;
        long long int mod=1e9+7;
        for(int i=2;i<=n;i++){
            ans[i]=0;
            for(int j=0;j<i;j++){
                ans[i]=(ans[i]+ans[j]*ans[i-j-1])%mod;
            }
        }
        return ans[n];


    }
};
