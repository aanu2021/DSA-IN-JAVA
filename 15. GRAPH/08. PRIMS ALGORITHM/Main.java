

// User function Template for Java

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

class Solution{
	static int spanningTree(int n, int m, int edges[][]){
	    int sumMST = 0;
	    PriorityQueue<Pair> pq = new PriorityQueue<>();
	    ArrayList<Pair> graph[] = new ArrayList[n];
	    for(int i=0;i<n;i++){
	        graph[i] = new ArrayList<Pair>();
	    }
	    for(int i=0;i<m;i++){
	        int u = edges[i][0];
	        int v = edges[i][1];
	        int wt = edges[i][2];
	        graph[u].add(new Pair(v,wt));
	        graph[v].add(new Pair(u,wt));
	    }
	    boolean visited[] = new boolean[n];
	    pq.add(new Pair(0,0));
	    while(!pq.isEmpty()){
	        int node = pq.peek().node;
	        int wt = pq.peek().wt;
	        pq.remove();
	        if(visited[node] == true) continue;
	        visited[node] = true;
	        sumMST += wt;
	        for(Pair p : graph[node]){
	            int nbr = p.node;
	            int edgeWt = p.wt;
	            if(visited[nbr] == true) continue;
	            pq.add(new Pair(nbr, edgeWt));
	        }
	    }
	    return sumMST;
	}
}