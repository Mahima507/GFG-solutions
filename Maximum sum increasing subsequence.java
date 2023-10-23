class Solution
{
	public int maxSumIS(int a[], int n)  
	{  //code here.
	      int msis[] = new int[n];   msis[0] = a[0];
     
        int res=msis[0];
        
        for (int i = 1; i < n; i++)
        {
            msis[i] = a[i];
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i] && msis[i] < msis[j] + a[i])
                {
                    msis[i] = msis[j] + a[i];
                }
            }
             res= Math.max(res, msis[i]);
        }
        return res;
	}  
}
