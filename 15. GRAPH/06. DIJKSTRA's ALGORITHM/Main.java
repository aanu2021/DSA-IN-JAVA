class Pair implements Comparable<Pair>{
    int node;
    int wt;
    Pair(int node, int wt){
        this.node = node;
        this.wt = wt;
    }
    public int compareTo(Pair p2){
        return this.wt - p2.wt;
    }
}

class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int n, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        int dist[] = new int[n];
        boolean visited[] = new boolean[n];
        for(int i=0;i<n;i++){
            dist[i] = Integer.MAX_VALUE;
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(S,0));
        dist[S] = 0;
        while(!pq.isEmpty()){
            int node = pq.peek().node;
            int wt = pq.peek().wt;
            pq.remove();
            if(visited[node] == true) continue;
            visited[node] = true;
            for(ArrayList<Integer> nbrs : adj.get(node)){
                int nbr = nbrs.get(0);
                int edgeWt = nbrs.get(1);
                if(visited[nbr] == true) continue;
                if(dist[nbr] > dist[node] + edgeWt){
                    dist[nbr] = dist[node] + edgeWt;
                    pq.add(new Pair(nbr, dist[nbr]));
                }
            }
        }
        return dist;
    }
}