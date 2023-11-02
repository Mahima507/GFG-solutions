class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
   int last_idx=-1;
    int ans = Integer.MAX_VALUE;
    for(int i=0; i<n; i++)
    {
        if(a[i]==x || a[i]==y){
            if(last_idx!=-1 && a[last_idx]!=a[i])
            ans = Math.min(ans, i-last_idx);
            
            last_idx=i;
        }
    }
    return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}
