
class StockArray2{
    public static void main(String[] args) {
        int[] arr = new int[]{5,2,7,3,6,1,2,4};
        int profit = maxProfit(arr);
    }

    public static int maxProfit(int arr[]){
        int minRn = arr[0], profit = 0;
        for(int i=0; i<arr.length; ++i)
            if(arr[i] >= arr[i+1])
                minRn = arr[i+1];
            else{
                profit += arr[i+1] - minRn;
                minRn = arr[i+1];
            }
        return profit;
    }
}