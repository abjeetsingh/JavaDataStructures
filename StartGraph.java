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
        ArrayList<Edge> graph[] = new ArrayList[7];

        for(int i=0; i<noVer; ++i)
            graph[i] = new ArrayList<Edge>();

        graph[0].add(new Edge(0, 2, 10));
    }

}