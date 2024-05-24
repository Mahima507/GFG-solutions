//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int d;
            d = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.countPartitions(n, d, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    static int mod=1000000007;
    static int help(int n,int d,int[] arr,int sum,int temp,int index,int dp[][]){
        if(sum-temp-temp<d)return 0;
        if(index==n){
            int secondSum=sum-temp;
            if(secondSum-temp==d)return 1;
            return 0;
        }
        if(dp[index][temp]!=-1)return dp[index][temp];
        int a = help(n,d,arr,sum,temp,index+1,dp);
        int b = help(n,d,arr,sum,temp+arr[index],index+1,dp);
        return dp[index][temp] = (a+b)%mod;
    }
    public static int countPartitions(int n, int d, int[] arr) {
        // code here
        int sum=0;
        for(int i=0;i<n;i++)sum+=arr[i];
        int dp[][] = new int[n][sum+1];
        for(int x[]:dp)Arrays.fill(x,-1);
        return help(n,d,arr,sum,0,0,dp);
    }
}
        
