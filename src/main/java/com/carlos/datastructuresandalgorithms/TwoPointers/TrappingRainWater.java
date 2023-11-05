package com.carlos.datastructuresandalgorithms.TwoPointers;

class TrappingRainWater {
    // My first hard problem that I solved on my own. YAY!
    public int trap(int[] height) {

        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int leftMaxHeight = height[leftPointer];
        int rightMaxHeight = height[rightPointer];
        int result = 0;

        while(leftPointer < rightPointer) {

            if(leftMaxHeight > height[leftPointer]) {
                result  += (leftMaxHeight - height[leftPointer]);
                height[leftPointer] = leftMaxHeight;
            } else {
                leftMaxHeight = height[leftPointer];
            }

            if(rightMaxHeight > height[rightPointer]) {
                result  += (rightMaxHeight - height[rightPointer]);
                height[rightPointer] = rightMaxHeight;
            } else {
                rightMaxHeight = height[rightPointer];
            }

            if(leftMaxHeight < rightMaxHeight) leftPointer++;
            else rightPointer--;
        }

        return result;
    }
}