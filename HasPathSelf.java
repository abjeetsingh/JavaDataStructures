import java.util.ArrayList;
import java.util.Scanner;

class HasPathSelf{
    static class Edge{
        int v1;
        int v2;
        int wt;
    
        Edge(int _v1, int _v2, int _wt){
            this.v1 = _v1;
            this.v2 = _v2;
            this.wt = _wt;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int noVert = scn.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[noVert];

        for (int i=0; i<noVert; ++i)
            graph[i] = new ArrayList<Edge>();

        int totalEdges = scn.nextInt();
        for(int i=0; i<totalEdges; ++i){
            String[] input = scn.nextLine().split(" ");
            int v1 = Integer.parseInt(input[0]);
            int v2 = Integer.parseInt(input[1]);
            int wt = Integer.parseInt(input[2]);

            graph[v1].add(new Edge(v1,v2,wt));
            graph[v2].add(new Edge(v2,v1,wt));
            
        }
 
        int src = scn.nextInt();
        int desc = scn.nextInt();

        boolean[] visited = new boolean[noVert];

        boolean pathExist = DoesHavePath(graph, visited, src, desc);

    }

    public static DoesHavePath(ArrayList<Edge>[] graph, boolean visited[], int src, int desc){
        if(src = desc)
            return true;
        
        visited[src] = true;
        for(int i=0; i<graph[src].size();++i){
            Edge v2 = graph[src].get(i).v2;
            if(visited[v2] == false){
                boolean answer = DoesHavePath(graph, visited, v2, desc);
                if(answer)
                    return true;
            }
        }
        return false;
    }
}