//User function template for JAVA

/*You are required to complete this method */
class Solution
{
     int atoi(String s) {
    	// Your code here
	    int num=0;
        for(int i=0;i<s.length();i++){
            if(i==0&&s.charAt(i)=='-')
            continue;
            if(s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<=9){
                num = num*10 + (s.charAt(i)-'0');
            }
            else 
            return -1;
        }
        if(s.charAt(0)=='-')
        num*=-1;
        return num;
    }
}
