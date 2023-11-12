class Solution
{
    public:
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    bool isRotated(string str1, string str2)
    {
        // Your code here
        int n=str1.length();
        if(n==2) return str1==str2;
        for(int i=0;i<n;i++){
            if( str1[(i+2)%n]==str2[i] || str1[(n+i-2)%n]==str2[i] ) continue;
            else return false;
        }
        return true;
    }

};
