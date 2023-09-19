//User function Template for Java

class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
    int count = 1;
    while (n > 0) {
        if ((n & 1) == 1) {
            return count;
        }
        n >>= 1;
        count++;
    }
    return 0;
  }
}
