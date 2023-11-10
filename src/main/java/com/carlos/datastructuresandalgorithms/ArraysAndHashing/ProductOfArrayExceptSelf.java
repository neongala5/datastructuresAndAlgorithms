package com.carlos.datastructuresandalgorithms.ArraysAndHashing;

class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        final int len = nums.length;
        int[] answer = new int[len];

        answer[0] = 1;

        for(int i = 1; i < len; i++) {
            answer[i] = answer[i-1] * nums[i-1];
        }

        int R = 1;
        for(int i = len - 1; i >= 0; i--) {
            answer[i] *= R;
            R *= nums[i];
        }

        return answer;
    }
}