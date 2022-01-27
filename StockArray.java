

class StockArray{
    public static void main(String[] args) {
        int arr[] = new int[]{5,3,1,7,4,9,3};
        find(arr);
    
    }

    public static void find(int[] arr){
    int minElePos=-1, minEle=arr[0], maxEle;
    for(int i=0; i<arr.length;++i)
        if(arr[i]<minEle){
            minEle = arr[i];
            minElePos = i;
        }
    maxEle = arr[minElePos];
    for(int i=minElePos; i<arr.length;++i)
        if(arr[i]>maxEle)
            maxEle = arr[i];
    System.out.println("Buy time at --> "+minEle+"\n Sell Time at --> "+maxEle);
    System.out.println("MAX PROFIT --> " + (maxEle-minEle) );
    }
}