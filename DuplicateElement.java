class Solution {
    public int findDuplicate(int[] nums) {
        int index;
        for(int i=0;i<nums.length;++i){
            index = Math.abs(nums[i])-1;
            if(nums[index]<0) return index+1;
            nums[index]= -nums[index];
        }
        return 0;
    }
}
