import java.util.ArrayList;
import java.util.Scanner;

class AllPathSelf{
    static class Edge{
        int nod;
        int nbr;
        int wt;

        Edge(int v1,int v2,int wt){
            this.nod = v1;
            this.nbr = v2;
            this.wt = wt;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int noVertices = scn.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[noVertices];

        // adding arraylist to the array of edges

        for (int i=0; i < noVertices; ++i)
            graph[i] = new ArrayList<Edge>();

        int noEdges = scn.nextInt();
        for (int i=0; i<noEdges; ++i){
            String[] info = scn.nextLine().split(" ");
            int v1 = Integer.parseInt(info[0]);
            int v2 = Integer.parseInt(info[1]);
            int wt = Integer.parseInt(info[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v1, v2, wt));
        }

        int strt = scn.nextInt();
        int dest = scn.nextInt();

        scn.close();

        // showAllPath(graph,strt, dest, new boolean[graph.length]);
    } 
}