package com.carlos.datastructuresandalgorithms.BinarySearch;

class BinarySearch {
    public int search(int[] nums, int target) {
        int pointer;
        int leftMax = 0;
        int rightMax = nums.length-1;

        int resultIndex = -1;

        while(leftMax <= rightMax){
            pointer = (rightMax + leftMax) / 2;
            if(nums[pointer] == target){
                resultIndex = pointer;
                return resultIndex;
            } else if(nums[pointer] < target){
                leftMax = pointer+1;
            } else if(nums[pointer] > target){
                rightMax = pointer-1;
            }
        }
        return resultIndex;
    }
}
