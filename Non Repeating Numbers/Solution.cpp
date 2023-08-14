class Solution
{
public:
    vector<int> singleNumber(vector<int> nums) 
    {
        // Code here.
        int x=0;
        for(int i=0;i<nums.size();i++){
            x=x^nums[i];
        }
        int k=x&(~(x-1));
        int ans1=0,ans2=0;
        vector<int>ans;
        for(int i=0;i<nums.size();i++){
            if((nums[i]&k)!=0){
                ans1=ans1^nums[i];
            }
            else{
                ans2=ans2^nums[i];
            }
        }
        ans.push_back(min(ans1,ans2));
        ans.push_back(max(ans1,ans2));
        return ans;
        
    }
};
