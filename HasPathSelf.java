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

    }
}