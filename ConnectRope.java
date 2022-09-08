import java.util.PriorityQueue;

class ConnectRope{
    public static long solution(long arr, int n){
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        for (int i = 0; i < n; i++) 
            pq.add(arr[i]);
        int ans = 0;
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            ans += first+second;
            pq.add(first+second);
        }
        return ans;
    }
}