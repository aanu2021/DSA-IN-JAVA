import java.io.*;
import java.util.*;
import java.util.Queue;


class Main{

    public static void BFS(int src, ArrayList<Integer> graph[], int n){
        boolean visited[] = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        System.out.println("BFS Traversal of the graph ....");
        q.add(src);
        visited[src] = true;
        while(!q.isEmpty()){
            int sz = q.size();
            while(sz-- > 0){
                int node = q.peek(); q.remove();
                System.out.print(node + " ");
                for(int nbr : graph[node]){
                    if(visited[nbr] == true) continue;
                    visited[nbr] = true;
                    q.add(nbr);
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void recursion(int node, ArrayList<Integer>graph[], boolean visited[]){
        if(visited[node] == true) return;
        visited[node] = true;
        System.out.print(node + " ");
        for(int nbr : graph[node]){
            if(visited[nbr] == true) continue;
            recursion(nbr, graph, visited);
        }
    }

    public static void DFS(int src, ArrayList<Integer>graph[], int n){
        boolean visited[] = new boolean[n];
        recursion(src, graph, visited);
        System.out.println("");
    }

    public static void printPaths(ArrayList<Integer>path){
        for(int i=0;i<path.size()-1;i++){
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println(path.get(path.size()-1));
    }

    public static void findAllPaths(int node, int target, ArrayList<Integer>graph[], boolean visited[], ArrayList<Integer>path){
        if(node == target){
            printPaths(path);
        }
        for(int nbr : graph[node]){
            if(visited[nbr] == true) continue;
            visited[nbr] = true;
            path.add(nbr);
            findAllPaths(nbr, target, graph, visited, path);
            path.remove(path.size()-1);
            visited[nbr] = false;
        }
    }

    public static void main(String[] args){
        int n = 6;
        ArrayList<Integer> graph[] = new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i] = new ArrayList<>();
        }
        
        graph[0].add(1);
        graph[0].add(2);
        
        graph[1].add(0);
        graph[1].add(2);
        graph[1].add(3);

        graph[2].add(0);
        graph[2].add(1);
        
        graph[3].add(1);
        graph[3].add(5);
        graph[3].add(4);

        graph[4].add(3);
        graph[4].add(5);

        graph[5].add(4);
        graph[5].add(3);
 
        // BFS(0, graph, n);

        // DFS(0, graph, n);

        // ArrayList<Integer>path = new ArrayList<>();
        // path.add(0);

        // boolean visited[] = new boolean[n];
        // visited[0] = true;

        // findAllPaths(0,5,graph,visited,path);

    }
}

/*

    0 -- 1 -- 3 -- 4
    |  /       \   |
    | /         \  |
    2             5 

*/    