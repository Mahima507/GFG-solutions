// User function Template for Java
class Solution {
   static String armstrongNumber(int n){
        // code here
        int num=0,temp=n;
        while(temp!=0){
            int digit=temp%10;
            num+=digit*digit*digit;
            temp/=10;
        }
        return num==n?"true":"false";
    }
}
