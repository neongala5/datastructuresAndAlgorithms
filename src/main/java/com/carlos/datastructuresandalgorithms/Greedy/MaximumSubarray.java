package com.carlos.datastructuresandalgorithms.Greedy;

class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int currentMax = nums[0];

        for(int i = 1; i < nums.length; i ++) {
            currentMax = Math.max(currentMax + nums[i], nums[i]);
            max = Math.max(max, currentMax);
        }
        return max;
    }
}