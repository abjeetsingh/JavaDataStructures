class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int mergeSize = (n+m);
        
        if(mergeSize & 1 == 0){
            double mid=-1,mid2=-1;
            int i=0,j=0;
            int tillNow = -1;
            while(i !=m || j!=n){
                if(num1[i] < num2[j]){
                    mid2 = mid1;
                    mid1 = num[i];
                    ++i
                }
                 else{
                     mid2 = mid1;
                    mid1 = num[j];
                    ++j;
                 }
                tillNow++;
                if(tillNow==(mergeSize/2))
                    return (mid1+mid2);
            }
        }
        else{
            double mid = -1;
            int i=0,j=0;
            int tillNow = -1;
            while(i !=m || j!=n){
                if(num1[i] < num2[j]){
                    mid1 = num[i];
                    ++i
                }
                 else{
                    mid1 = num[j];
                    ++j;
                 }
                tillNow++;
                if(tillNow==(mergeSize/2))
                    return (mid1+mid2);
            }
        }
    }
}