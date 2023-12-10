class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int a[],int n)
    {
         //Your code here
         Set<Integer>  set  = new HashSet<>();
        int sum = 0 ;
        for( int i= 0 ; i<n  ; i++)
        {
            set.add(sum);
            sum = sum + a[i];
            
            if(set.contains(sum))
            return true;
        }
        return false;
    }
}
