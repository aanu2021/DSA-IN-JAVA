class Solution {
    // Function to detect cycle in a directed graph.
    
    public boolean isCycle(int u,ArrayList<ArrayList<Integer>>adj,boolean vis[],boolean cvis[]){
        vis[u] = true;
        cvis[u] = true;
        for(int v:adj.get(u)){
            if(vis[v] == true){
                if(cvis[v] == true){
                    return true;
                }
            }
            else{
                boolean flag = isCycle(v,adj,vis,cvis);
                if(flag) return true;
            }
        }
        cvis[u] = false;
        return false;
    }
    
    public boolean isCyclic(int n, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[n];
        boolean cvisited[] = new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i] == true) continue;
            if(isCycle(i,adj,visited,cvisited) == true){
                return true;
            }
        }
        return false;
    }
}