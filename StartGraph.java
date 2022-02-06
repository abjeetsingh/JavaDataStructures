import java.io.ObjectInputFilter.Status;
import java.util.ArrayList;

class StartGraph{
    
    static class Edge{
        int v1; // Vertix1
        int v2; // Vertix2
        int wt; // Weight

        public Edge(int _v1, int _v2, int _wt){
            this.v1 = _v1;
            this.v2 = _v2;
            this.wt = _wt;
        }
    }

    public static void main(String[] args) {
        int noVer = 7;
        ArrayList<Edge> graph[] = new ArrayList[7]; // this is an array of arrayList

        for(int i=0; i<noVer; ++i)
            graph[i] = new ArrayList<Edge>();
// LISTING ALL THE EDGES
        graph[0].add(new Edge(0, 3, 40));
        graph[0].add(new Edge(0, 1, 10));

        graph[0].add(new Edge(1, 0, 10));
        graph[0].add(new Edge(1, 2, 10));

        graph[0].add(new Edge(2, 3, 10));
        graph[0].add(new Edge(2, 1, 10));

        graph[0].add(new Edge(3, 0, 40));
        graph[0].add(new Edge(3, 2, 10));
        graph[0].add(new Edge(3, 4, 2));

        graph[0].add(new Edge(4, 3, 2));
        graph[0].add(new Edge(4, 5, 3));
        graph[0].add(new Edge(4, 6, 3));
        
        graph[0].add(new Edge(5, 4, 3));
        graph[0].add(new Edge(5, 6, 3));
        
        graph[0].add(new Edge(6, 5, 3));
        graph[0].add(new Edge(6, 4, 8));
        
        for (ArrayList a:graph)
        for (Edge edg: a)
            System.out.println(edg);
    }
    
}