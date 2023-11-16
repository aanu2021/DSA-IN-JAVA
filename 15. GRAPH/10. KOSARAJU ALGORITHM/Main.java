class Solution
{
    //Function to find number of strongly connected components in the graph.
    
    public void dfs(int u,ArrayList<ArrayList<Integer>>adj,boolean visited[],Stack<Integer> S){
        if(visited[u] == true) return;
        visited[u] = true;
        for(int v : adj.get(u)){
            if(visited[v] == true) continue;
            dfs(v,adj,visited,S);
        }
        S.push(u);
    }
    
    public void dfs2(int u,ArrayList<ArrayList<Integer>>adj,boolean visited[]){
        if(visited[u] == true) return;
        visited[u] = true;
        for(int v : adj.get(u)){
            if(visited[v] == true) continue;
            dfs2(v,adj,visited);
        }
    }
    
    public int kosaraju(int n, ArrayList<ArrayList<Integer>> adj)
    {
        boolean visited[] = new boolean[n];
        Stack<Integer> S = new Stack<>();
        ArrayList<ArrayList<Integer>>radj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            radj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++){
            for(int j : adj.get(i)){
                radj.get(j).add(i);
            }
        }
        for(int i=0;i<n;i++){
            if(visited[i] == true) continue;
            dfs(i,adj,visited,S);
        }
        for(int i=0;i<n;i++){
            visited[i] = false;
        }
        int cnt = 0;
        while(!S.isEmpty()){
            int node = S.peek();
            S.pop();
            if(visited[node] == true) continue;
            dfs2(node,radj,visited);
            cnt++;
        }
        
        return cnt;
    }
}