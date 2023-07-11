class Solution
{
    public:
    /*You are required to complete this method*/
    int findK(int a[MAX][MAX],int n,int m,int k)
    {
     // Your code goes here.
     vector<int>ans;
     int l=0,r=m-1;
     int t=0,d=n-1;
     while(l<=r&&t<=d){
         for(int j=l;j<=r;j++){
             ans.push_back(a[t][j]);
         }
         t++;
         for(int i=t;i<=d;i++){
             ans.push_back(a[i][r]);
         }
         r--;
         for(int j=r;j>=l;j--){
             ans.push_back(a[d][j]);
         }
         d--;
         for(int i=d;i>=t;i--){
             ans.push_back(a[i][l]);
         }
         l++;
     }
     return ans[k-1];
    }
};
