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
        for(int i:a)
            System.out.print(i + "\t");

        int pos = scn.nextInt();
        int ans = eleArr(0,a,pos);
        System.out.println("\n\n The first occurance of " + pos + " is at = " + (ans+1) );
        scn.close();
    }

    public static int eleArr(int idx,int a[],int pos)
    {
        if(idx >= a.length)
            return -1;

        if ( a[idx]== pos)
            return idx;
        else
            return eleArr(idx+1, a, pos);
        
    }
}