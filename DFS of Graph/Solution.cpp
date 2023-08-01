class Solution {
public:
    // Function to return a list containing the DFS traversal of the graph.
    vector<bool> vis; 
    
    void dfs(int n, vector<int> adj[], vector<int>& ans, int V) {
        vis[V] = true;
        ans.push_back(V);
        
        for (auto u : adj[V]) {
            if (!vis[u]) {
                dfs(n, adj, ans, u);
            }
        }
    }
    
    vector<int> dfsOfGraph(int n, vector<int> adj[]) {
        // Code here
        vector<int> ans;
        
        for (int i = 0; i < n; i++) {
            vis.push_back(false);
        }
        
        dfs(n, adj, ans, 0);
        
        return ans;
    }
};
