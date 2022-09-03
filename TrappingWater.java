class TrappingWater {
    public int trap(int[] height) {
        // finding the Maximum height from Left
        int leftToRight[] = new int[height.length];
        int rightToLeft[] = new int[height.length];
        // int maxHeight = Integer.MIN_VALUE;
        leftToRight[0] = height[0];
        rightToLeft[height.length-1] = height[height.length-1];
        for(int i=1;i<height.length;++i){
            // if(maxHeight <= height[i])
            //     maxHeight = height[i];
            leftToRight[i] = Math.max(height[i],leftToRight[i-1]);
        }
        //Finding the MaxHeight form the right
        // maxHeight = Integer.MIN_VALUE;
        for(int i=height.length-2;i>=0;--i){
            // if(maxHeight <= height[i])
            //     maxHeight = height[i];
            rightToLeft[i] = Math.max(rightToLeft[i+1],height[i]);
        }
        int ans = 0;
        for(int i=0;i<height.length;++i){
            ans += Math.min(leftToRight[i],rightToLeft[i]) - height[i];
        }
        return ans;
    }
}