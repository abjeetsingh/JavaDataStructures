import java.util.*;

public class MaxEle{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a[] = new int[10];
        for(int i=0;i<10;++i)
            {
                int n;
                System.out.println("Enter element "+ (i+1) + " : " );
                n = scn.nextInt();
                a[i] = n;
            }
        
        int ans = maxarr(a, 0);
        System.out.println(ans);
        scn.close();
    }

    public static int maxarr(int a[], int idx){
        if(idx >= a.length)
            return a[a.length-1];
        
        int max = maxarr(a, idx+1);

        if (maxarr(a, idx)<a[idx])
            return a[idx];
        else
            return max;


    }
}