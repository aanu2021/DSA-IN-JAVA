class Edge{
    int u;
    int v;
    int wt;
    Edge(int u,int v,int wt){
        this.u = u;
        this.v = v;
        this.wt = wt;
    }
}

class DSU{
    int Parent[];
    int Rank[];
    DSU(int n){
        Parent = new int[n];
        Rank = new int[n];
        for(int i=0;i<n;i++){
            Parent[i] = i;
            Rank[i] = 1;
        }
    }
    int find(int x){
        if(Parent[x] == x) return x;
        return Parent[x] = find(Parent[x]);
    }
    boolean isSameGroup(int x,int y){
        int lx = find(x);
        int ly = find(y);
        if(lx != ly) return false;
        else return true;
    }
    void Union(int x,int y){
        if(isSameGroup(x,y) == true) return;
        int lx = find(x);
        int ly = find(y);
        if(Rank[lx] > Rank[ly]){
            Parent[ly] = lx;
        }
        else{
            Parent[lx] = ly;
            if(Rank[lx] == Rank[ly]){
                Rank[lx]++;
            }
        }
    }
}

class Solution{
	static int spanningTree(int n, int m, int edges[][]){
	    List<Edge> edgeList = new ArrayList<Edge>(); 
	    for(int i=0;i<m;i++){
	        int u = edges[i][0];
	        int v = edges[i][1];
	        int wt = edges[i][2];
	        edgeList.add(new Edge(u,v,wt));
	    }
	    edgeList.sort(new Comparator<Edge>(){
	        public int compare(Edge e1,Edge e2){
	            return e1.wt - e2.wt;
	        }
	    });
	    int sumMST = 0;
	    DSU obj = new DSU(n);
	    for(int i=0;i<m;i++){
	        int u = edgeList.get(i).u;
	        int v = edgeList.get(i).v;
	        int wt = edgeList.get(i).wt;
	        if(obj.isSameGroup(u,v)) continue;
	        sumMST += wt;
	        obj.Union(u,v);
	    }
	    return sumMST;
	}
}