class Solution {

    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];

        int ans = -1;
        for (int i = 0; i < V; i++) {
        if (!visited[i]) {
            dfs(i, adj, visited);
             ans = i;
        }
        }
        
        //again need to check
        boolean[] visited2 = new boolean[V];
        dfs(ans, adj, visited2);
        for(boolean x : visited2)
        {
            if (!x) return -1;
        }

        return ans;
    }

   void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited){
       visited[node]=true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited);
            }
        }
    }
}
