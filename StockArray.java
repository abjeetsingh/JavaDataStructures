

class StockArray{
    public static void main(String[] args) {
        int arr[] = new int[]{7,1,5,3,6,4};
        find(arr);
    
    }

    public static void find(int[] arr){
    int minEle = arr[0], maxProfit=0;
    for(int i=0; i<arr.length;++i)
    {   if(arr[i]<minEle)
            minEle = arr[i];
        if(maxProfit <= (arr[i] - minEle))
            maxProfit = arr[i]-minEle;
    }
    System.out.println("Buy time at --> "+minEle);
    System.out.println("MAX PROFIT --> " + maxProfit );
    }
}