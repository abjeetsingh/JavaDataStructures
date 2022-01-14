import java.util.Scanner;

class josephus{

    int arr[];
    public static int josephus(int n,int k){
       if (n==1)
            return 0;
        return (josephus(n-1, k) +k)%n;
    }

    public static void main(String[] args){
        int k,n;
        System.out.println("Enter the number of people");
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        System.out.println("Enter the number of people after which we should shoot");
        k = scn.nextInt();
        int temp = josephus(n, k);
        System.out.println(temp);
    }
}