import java.util.Scanner;

class josephus{

    public static void main(String[] args){
        int k,n;
        System.out.println("Enter the number of people");
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        System.out.println("Enter the number of people after which we should shoot");
        k = scn.nextInt();
        int arr[] = new int[n];

        for (int i=0; i<n;++i)
            arr[i]=i;

        for(int t:arr){
            System.out.println(t);
        }
    }
}