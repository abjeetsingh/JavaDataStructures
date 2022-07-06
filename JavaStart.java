java.util.*;

class javaStart{
    public static void main(){
        int[] arr = {4,0,3,1,2};
        int n = 5;
        solve(n, arr);  
    }
    public static void solve(int n, int[] arr){
        int wholeSum = ((n+1)*(n+2))/2;
        int arrSum = 0;
        int arrProd = 1;
        for (int i:arr){
            arrSum += i;
            arrProd *= i;
        }
        int xPlusY = wholeSum - arrSum;
        int xIntoY = fact(n+1)/arrProd;
        root value = xPlusY*xPlusY - y
        int x =  xPlusY + Math.sqrt((xPlusY*xPlusY - 4xIntoY))
        System.out.println(x);
    }

    public static int fact(int n){
        if n == 1 || n == 0;
            return 1;
        return n*fact(n-1);
    }
}