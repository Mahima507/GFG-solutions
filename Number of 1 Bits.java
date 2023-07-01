// User function Template for Java
class Solution {
    static int setBits(int N) {
        // code here
        int setBits=0;
        
while(N>0)
{
    N=N&(N-1);
    setBits++;
}

    return setBits;
    }
}
