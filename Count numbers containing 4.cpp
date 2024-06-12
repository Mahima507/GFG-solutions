class Solution {
 public: 
     int countNumberswith4(int n) {
        // code here
        int ans=0;
        for(int i=4;i<=n;i++){
            int j=i;
            while(j){
                if(j%10==4){
                    ans++;
                    break;
                }
                j/=10;
            }
        }
        return ans;
    }

};
