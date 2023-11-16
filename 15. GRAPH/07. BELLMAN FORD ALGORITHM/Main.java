class Solution {
    static int[] bellman_ford(int n, ArrayList<ArrayList<Integer>> edges, int S) {
        int dist[] = new int[n];
        int MAX = 100000000;
        for(int i=0;i<n;i++){
            dist[i] = MAX;
        }
        dist[S] = 0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<edges.size();j++){
                int u = edges.get(j).get(0);
                int v = edges.get(j).get(1);
                int wt = edges.get(j).get(2);
                if(dist[u] != MAX && (dist[v] > dist[u] + wt)){
                    dist[v] = dist[u] + wt;
                }
            }
        }
        for(int j=0;j<edges.size();j++){
            int u = edges.get(j).get(0);
            int v = edges.get(j).get(1);
            int wt = edges.get(j).get(2);
            if(dist[u] != MAX && (dist[v] > dist[u] + wt)){
                int ans[] = new int[1];
                ans[0] = -1;
                return ans;
            }
        }
        return dist;
    }
}