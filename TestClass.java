import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        int t,n,k;
        Scanner scn = new Scanner(System.in);
        t = scn.nextInt();
        while(t>=0){
            n = scn.nextInt();
            k = scn.nextInt();
            t--;
            int[] arr = new int[n];

            for(int i=0; i<n; ++i)
                {
                    int temp = scn.nextInt();
                    arr[i] = temp;
                }
            k = k%n;
            if(k == 0)
                for(int i:arr)
                    System.out.print(i);
            else{
                for(int i=1; i<=k; ++i)
                    System.out.print(arr[n-i]);
                for(int i=0; i<=n-k-1; ++i)
                    System.out.print(arr[i]);
            }

        }
    }
}
