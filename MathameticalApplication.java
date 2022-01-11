import static java.lang.Math.sqrt;
import java.util.*;

class MathameticalApplication{

    public static void main(String[] args)
    {
        byte n;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elementsd you want");
        n = scn.nextByte();
        byte arr[] = new byte[n+1];
        for(byte i=0;i<=n;++i){
            arr[i] = i;
        }

        sieveOfErotoStenes(arr, n);
    }

    public static void sieveOfErotoStenes(byte arr[], byte n){

        boolean sieve[] = new boolean[n+1];
        Arrays.fill(sieve, true);
        sieve[0]= false;
        sieve[1] = false;

        for (int i=2; i <= sqrt(n+1); ++i)
            for(int j = 2*i;j<=n;j+=i)
                sieve[j] = false;

        for( byte i=0;i<=n;++i)
            System.out.println(arr[i] + " "+ sieve[i]);
    }
}