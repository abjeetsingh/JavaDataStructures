
class StockArray2{
    public static void main(String[] args) {
        int[] arr = new int[]{5,2,7,3,6,1,2,4};
        int profit = maxProfit(arr);
        System.out.println(profit);
    }

    public static int maxProfit(int arr[]){
        int minRn = arr[0], profit = 0;
        for(int i=1; i<arr.length; ++i)
            if(arr[i]>arr[i-1])
                profit += arr[i]-arr[i-1];
        return profit;
    }
}