import Math;
class StockArray3{
    public static void main(String[] args) {
        int[] arr = new int[]{5,2,7,3,6,1,2,4};
        int profit = maxProfit(arr);
        System.out.println(profit);
    }

    public static int MaxInArray(int arr[]){
        int profit=0, maxELe = arr[0], minEle=arr[0];
        for(int i=0; i<arr.length; ++i){
            minEle = Math.min(minEle, arr[i]);
            maxELe = Math.max(maxELe, arr[i]);
        }
        return 
    }

    public static int maxProfit(int arr[]){
        int profit = 0, minEle = arr[0], maxEle;
        for(int i=0; i<arr.length; ++i){
            minEle = Math.min(arr[i], minEle);
        }
        
        return profit;
    }
}