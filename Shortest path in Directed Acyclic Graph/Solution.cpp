class Solution {
  public:
     vector<int> shortestPath(int N, int M, vector<vector<int>>& edges) {
        vector<vector<vector<int>>> adj(N);
    
        for (int i = 0; i < N; i++) {
            adj[i] = vector<vector<int>>();
        }
    
        for (int i = 0; i < M; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
    
            vector<int> t1 = { v, w };
            adj[u].push_back(t1);
        }
    
        queue<vector<int>> q;
        vector<int> dist(N, INT_MAX);
    
        dist[0] = 0;
        q.push({ 0, 0 });
    
        while (!q.empty()) {
            vector<int> values = q.front();
            q.pop();
    
            int node = values[0];
            int distance = values[1];
    
            for (vector<int> in : adj[node]) {
                int neighbor = in[0];
                int ndistance = in[1];
    
                if (distance + ndistance < dist[neighbor]) {
                    dist[neighbor] = distance + ndistance;
                    q.push({ neighbor, dist[neighbor] });
                }
            }
        }
    
        for (int i = 0; i < N; i++) {
            if (dist[i] == INT_MAX) {
                dist[i] = -1;
            }
        }
    
        return dist;
    }   
};
