package com.carlos.datastructuresandalgorithms.TwoPointers;

class TwoSumTwo {
    public int[] twoSum(int[] numbers, int target) {
        int aPointer = 0;
        int bPointer = numbers.length - 1;

        while(aPointer <= bPointer){
            int sum = numbers[aPointer] + numbers[bPointer];
            if(sum > target){
                bPointer--;
                continue;
            }

            if(sum < target){
                aPointer++;
                continue;
            }

            if(sum == target){
                return new int[]{aPointer+1,bPointer+1};
            }
        }

        return new int[]{aPointer,bPointer};
    }
}
