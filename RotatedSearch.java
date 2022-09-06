class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums,0,(nums.length-1),target);
        
    }
    
    public static int binarySearch(int[] nums, int low, int high, int target)
    {
        int mid = (low+high)/2;
        if(nums[mid]==target) return mid;
        if(low>high) return -1;
        if(nums[low]<=nums[mid]){
            if(nums[low]<=target && nums[mid]>target)
                return binarySearch(nums,low,mid-1,target);
            else
                return binarySearch(nums,mid+1,high,target);
        }
        else{
            if(nums[mid]<target && nums[high]>=target)
                return binarySearch(nums,mid+1,high,target);
            else
                return binarySearch(nums,low,mid-1,target);

        }
    }
}