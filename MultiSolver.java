import java.util.PriorityQueue;
import java.util.Scanner;

class Edge{
    int src;
    int nbr;
    int wt;

    Edge(int src, int nbr, int wt){  
        this.src = src;
        this.nbr = nbr;
        this.wt = wt;
    }
}

class MultiSolver{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int noVert = scn.nextInt();
        ArrayList<Edge>[] graph = new ArrayList();
        for(int i=0; i < noVert; ++i)
            graph[i] = new ArrayList<Edge>();
        int noEdge = scn.nextInt();
        for(int i=0; i<noEdge; ++i){
            String[] edgeDetail = scn.nextLine().split(" ");
            int src = Integer.parseInt(edgeDetail[0]);
            int nbr = Integer.parseInt(edgeDetail[1]);
            int wt = Integer.parseInt(edgeDetail[2]);
            graph[src].add(new Edge(src, nbr, wt));
            graph[nbr].add(new Edge(nbr,src,wt)); 
        }
        
    }
    static String spath;
    static int spathwt = Integer.MAX_VALUE();

    static String lpath;
    static int lpathwt = Integer.MIN_VALUE();

    static String cpath;
    static int cpathwt = Integer.MAX_VALUE();

    static String fpath;
    static int fpathwt = Integer.MIN_VALUE();

    static PriorityQueue<Pair> pq = new PriorityQueue<>();
}