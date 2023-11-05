class Solution {
  public:
    vector<int> topK(vector<int>& nums, int k) {
        vector<int> f(1e5 + 10, 0);
        
        for(auto i : nums)
            ++f[i];
            
        vector<pair<int,int>> list;
        
        for(int i = 0; i < 1e5 + 10; i++){
            if(f[i])
                list.emplace_back(i, f[i]);
        }
        
        sort(list.begin(), list.end(), [](pair<int,int> &a, pair<int,int> &b){
            if(a.second == b.second)
                return a.first > b.first;
            return a.second > b.second;
        });
        
        vector<int> ans(k);
        
        for(int i = 0; i < k; i++){
            ans[i] = list[i].first;
        }
        
        return ans;
    }
};
