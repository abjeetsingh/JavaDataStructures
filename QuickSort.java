
class QuickSort
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        int temp;
        int i=low,j=high;
        int pivot = arr[low];
        while(i<j)
        {
        while(i<=j && arr[i]<=pivot) i++;
        while(arr[j]>pivot)j--;
        if(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;}
        }
        temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    } 
}
