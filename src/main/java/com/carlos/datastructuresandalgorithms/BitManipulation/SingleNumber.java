package com.carlos.datastructuresandalgorithms.BitManipulation;

class SingleNumber {
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }
}