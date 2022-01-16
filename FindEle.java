import java.util.*;

public class FindEle{

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
        int pos = scn.nextInt();
        int ans = maxarr(0,a,pos);
        System.out.println(ans);
    }

    public static int maxarr(int idx,int a[],int pos)
    {
        if(idx >= a.length)
            return 0;
        
        int max = maxarr(idx+1,a,pos);

        if (max == pos)
            return idx;
        else
            return max;
        
    }
}