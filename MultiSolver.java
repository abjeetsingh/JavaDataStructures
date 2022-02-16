import java.nio.file.Path;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.*;
class MultiSolver{
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

    static class Pair implements Comparable<Pair>{
        int wsf;
        String psf;

        Pair(int wsf, String psf)
        {
            this.wsf = wsf;
            this.psf = psf;
        }

        public int compareTo(Pair o){
            return this.wsf - o.wsf;
        }
    }



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

        int src = Integer.parseInt(scn.nextLine());
        int dest = Integer.parseInt(scn.nextLine());
        int criteria = Integer.parseInt(scn.nextLine());
        int k = Integer.parseInt(scn.nextLine());
        boolean visited[] = new boolean[noVert];
        Solver(graph, src, dest, visited, criteria, k, src + "", 0);
        
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

    public static void Solver(ArrayList<Edge>[] graph,int src, int dest, boolean[] visited, int criteria, int k, String psf, int wsf){
        if(src == dest){
            if(wsf<spathwt){
                spathwt = wsf;
                spath = psf;
            }
            if(wsf>lpathwt){
                lpathwt = wsf;
                lpath = psf;
            }
            if(wsf > criteria && wsf < cpathwt){
                cpathwt = wsf;
                cpath = psf;
            }
            if(wsf > criteria && wsf < cpathwt){
                cpathwt = wsf;
                cpath = psf;
            }
            if(wsf < criteria && wsf > fpathwt){
                fpathwt = wsf;
                fpath = psf;
            }
            return;
        }
        visited[src] = true;
        for(Edge e:graph){
            if(visited[e.nbr] == false)
                Solver(graph, e.nbr, dest, visited, criteria, k, psf+e.nbr, wsf+e.wt);
        visited[src]=false;
        }
    }
}