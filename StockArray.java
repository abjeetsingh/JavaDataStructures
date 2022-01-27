

class StockArray{
    public static void main(String[] args) {
        int arr[] = new int[]{7,1,5,3,6,4};
        find(arr);
    
    }

    public static void find(int[] arr){
    int maxElePos=-1, minEle, maxEle=arr[0];
    for(int i=0; i<arr.length;++i)
        if(arr[i]>=maxEle){
            maxEle = arr[i];
            maxElePos = i;
        }
    minEle = arr[maxElePos];
    for(int i=0; i<maxElePos;++i)
        if(arr[i]<minEle)
            minEle = arr[i];
    System.out.println("Buy time at --> "+minEle+"\n Sell Time at --> "+maxEle);
    System.out.println("MAX PROFIT --> " + (maxEle-minEle) );
    }
}