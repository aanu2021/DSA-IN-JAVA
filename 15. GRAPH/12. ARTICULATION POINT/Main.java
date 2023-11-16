

class Solution
{
    //Function to return Breadth First Traversal of given graph.
    
    int disc[];
    int low[];
    int parent[];
    int isAP[];
    static int timer;
    
    public void dfs(int u, ArrayList<ArrayList<Integer>>adj){
        disc[u] = low[u] = timer++;
        int child = 0;
        for(int v : adj.get(u)){
            if(disc[v] == -1){
                child++;
                parent[v] = u;
                dfs(v, adj);
                low[u] = Math.min(low[u], low[v]);
                if(parent[u] == -1 && child > 1) isAP[u] = 1;
                if(parent[u] != -1 && low[v] >= disc[u]) isAP[u] = 1;
            }
            else if(v != parent[u]){
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
    
    public ArrayList<Integer> articulationPoints(int n,ArrayList<ArrayList<Integer>> adj)
    {
        timer = 0;
        disc = new int[n];
        low = new int[n];
        parent = new int[n];
        isAP = new int[n];
        
        for(int i=0;i<n;i++){
            disc[i] = -1;
            low[i] = -1;
            parent[i] = -1;
            isAP[i] = 0;
        }
        
        for(int i=0;i<n;i++){
            if(disc[i] == -1){
                dfs(i, adj);
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(isAP[i] == 1){
                list.add(i);
            }
        }
        
        if(list.size() == 0){
            list.add(-1);
        }
        return list;
    }
}