// User function Template for Java

class Solution {
    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        int res = 0;
        for(ArrayList<Integer> list : adj){
            res+=list.size();
        }
        return res;
    }
};

