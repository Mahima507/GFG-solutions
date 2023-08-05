class Solution{
    public:
 long long findMinDiff(vector<long long> a, long long n, long long m){
    //code
    sort(a.begin(), a.end());
    int ans=INT_MAX;
    int i=0, j=m-1;
    while(j<n){
        if(ans> (a[j]-a[i])) ans= a[j]-a[i];
        i++;   j++;
    }
    return ans;
    }  
};
